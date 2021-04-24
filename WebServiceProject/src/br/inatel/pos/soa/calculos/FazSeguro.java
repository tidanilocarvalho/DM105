/**
 * 
 */
package br.inatel.pos.soa.calculos;

import java.rmi.RemoteException;
import java.text.DecimalFormat;

import br.unicamp.ic.webservices.ageriskscoring.AgeRiskScoringProxy;
import br.unicamp.ic.webservices.fipe.FipeProxy;
import br.unicamp.ic.webservices.fipe.TabelaFipe;
import br.unicamp.ic.webservices.regionriskscoring.Regiao;
import br.unicamp.ic.webservices.regionriskscoring.RegionRiskScoringProxy;

/**
 * @author danilo.carvalho
 *
 */
public class FazSeguro {

    public static void main(String[] args) {
	try {
	    FipeProxy fp = new FipeProxy();
	    TabelaFipe tabela = fp.pesquisar("GM", "Camaro", 2010);
	    Double V = tabela.getPreco();
	    AgeRiskScoringProxy agr = new AgeRiskScoringProxy();
	    Double I = agr.calcular(31);
	    RegionRiskScoringProxy rrp = new RegionRiskScoringProxy();
	    Regiao regiao = rrp.obterRiskScoring(1);
	    Double R = regiao.getRegionRiskScoring();
	    Double seguro = (V * 0.05) + ((V * 0.05) * I) + ((V * 0.05) * R);
	    DecimalFormat decimal = new DecimalFormat("0.00");
	    System.out.println("Valor do Seguro = " + decimal.format(seguro));
	} catch (RemoteException e) {
	    e.printStackTrace();
	}
    }

}
