package br.unicamp.ic.webservices.regionriskscoring;

public class RegionRiskScoringProxy implements br.unicamp.ic.webservices.regionriskscoring.RegionRiskScoring {
  private String _endpoint = null;
  private br.unicamp.ic.webservices.regionriskscoring.RegionRiskScoring regionRiskScoring = null;
  
  public RegionRiskScoringProxy() {
    _initRegionRiskScoringProxy();
  }
  
  public RegionRiskScoringProxy(String endpoint) {
    _endpoint = endpoint;
    _initRegionRiskScoringProxy();
  }
  
  private void _initRegionRiskScoringProxy() {
    try {
      regionRiskScoring = (new br.unicamp.ic.webservices.regionriskscoring.RegionRiskScoringWSServiceLocator()).getRegionRiskScoringPort();
      if (regionRiskScoring != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)regionRiskScoring)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)regionRiskScoring)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (regionRiskScoring != null)
      ((javax.xml.rpc.Stub)regionRiskScoring)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.unicamp.ic.webservices.regionriskscoring.RegionRiskScoring getRegionRiskScoring() {
    if (regionRiskScoring == null)
      _initRegionRiskScoringProxy();
    return regionRiskScoring;
  }
  
  public br.unicamp.ic.webservices.regionriskscoring.Regiao obterRiskScoring(java.lang.Integer regiao) throws java.rmi.RemoteException{
    if (regionRiskScoring == null)
      _initRegionRiskScoringProxy();
    return regionRiskScoring.obterRiskScoring(regiao);
  }
  
  
}