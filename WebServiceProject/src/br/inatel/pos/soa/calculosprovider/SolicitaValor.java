package br.inatel.pos.soa.calculosprovider;

import java.rmi.RemoteException;

import br.unicamp.ic.webservices.ageriskscoring.AgeRiskScoringProxy;
import br.unicamp.ic.webservices.fipe.FipeProxy;
import br.unicamp.ic.webservices.fipe.TabelaFipe;
import br.unicamp.ic.webservices.regionriskscoring.Regiao;
import br.unicamp.ic.webservices.regionriskscoring.RegionRiskScoringProxy;

/**
 * @author danilo.carvalho
 *
 */
public class SolicitaValor {

    public double calcular(String marca, String modelo, Integer ano, Integer idade, Integer local) {
	Double seguro = 0.0;
	try {
	    FipeProxy fp = new FipeProxy();
	    TabelaFipe tb = fp.pesquisar(marca, modelo, ano);
	    Double V = tb.getPreco();
	    AgeRiskScoringProxy arp = new AgeRiskScoringProxy();
	    Double I = arp.calcular(idade);
	    RegionRiskScoringProxy rrp = new RegionRiskScoringProxy();
	    Regiao reg = rrp.obterRiskScoring(local);
	    Double R = reg.getRegionRiskScoring();
	    seguro = (V * 0.05) + ((V * 0.05) * I) + ((V * 0.05) * R);
	} catch (RemoteException e) {
	    e.printStackTrace();
	}
	return seguro;
    }

}
