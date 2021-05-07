package br.inatel.soa.pos;

import java.rmi.RemoteException;

import org.tempuri.CResultado;
import org.tempuri.CalcPrecoPrazoWSSoapProxy;

public class PostmanDaniloCarvalho {

	private static final String PAC_CODE = "04510";
	private static final String SEDEX_CODE = "04014";

	private static final int REASONABLE_DEADLINE_IN_DAYS = 3;
	
	private final CalcPrecoPrazoWSSoapProxy proxyService = new CalcPrecoPrazoWSSoapProxy();
	
	public String calcDeadline(String cepOrign, String cepDest) {	
		try {
			int deadlineSedexInDays = calcDeadLineSedexInDays(proxyService, cepOrign, cepDest);
			
			if (deadlineSedexInDays > REASONABLE_DEADLINE_IN_DAYS) {
				String deadlinePacInDays = calcDeadlinePacInDays(proxyService, cepOrign, cepDest);					
				
				return "Prazo inviável: " + deadlineSedexInDays + " dias. Aconselhamos usar o serviço PAC: " + deadlinePacInDays + " dias." + "Sai bem mais barato";
			} else {
				return "Prazo viável: " + deadlineSedexInDays + " dias";
			}
		} catch (RemoteException e) {
			return "Erro Imprevisto Ocorreu!: Error Message: " + e.getMessage();
		}
	}
	
	private int calcDeadLineSedexInDays(CalcPrecoPrazoWSSoapProxy proxyService, String cepOrign, String cepDest) throws RemoteException {
		CResultado cResultado = proxyService.getCalcPrecoPrazoWSSoap().calcPrazo(SEDEX_CODE, cepOrign, cepDest);
		
		if (cResultado.getServicos().length > 0) {
			return Integer.parseInt(cResultado.getServicos()[0].getPrazoEntrega());
		}
		
		return 0;
	}
	
	private String calcDeadlinePacInDays(CalcPrecoPrazoWSSoapProxy proxyService, String cepOrign, String cepDest) throws RemoteException  {
		CResultado cResultado = proxyService.getCalcPrecoPrazoWSSoap().calcPrazo(PAC_CODE, cepOrign, cepDest);
		
		if (cResultado.getServicos().length > 0) {
			return cResultado.getServicos()[0].getPrazoEntrega();
		}	
		
		return "unknow";
	}

}
