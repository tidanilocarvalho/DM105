package br.unicamp.ic.webservices.ageriskscoring;

public class AgeRiskScoringProxy implements br.unicamp.ic.webservices.ageriskscoring.AgeRiskScoring {
  private String _endpoint = null;
  private br.unicamp.ic.webservices.ageriskscoring.AgeRiskScoring ageRiskScoring = null;
  
  public AgeRiskScoringProxy() {
    _initAgeRiskScoringProxy();
  }
  
  public AgeRiskScoringProxy(String endpoint) {
    _endpoint = endpoint;
    _initAgeRiskScoringProxy();
  }
  
  private void _initAgeRiskScoringProxy() {
    try {
      ageRiskScoring = (new br.unicamp.ic.webservices.ageriskscoring.AgeRiskScoringWSServiceLocator()).getAgeRiskScoringPort();
      if (ageRiskScoring != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)ageRiskScoring)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)ageRiskScoring)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (ageRiskScoring != null)
      ((javax.xml.rpc.Stub)ageRiskScoring)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.unicamp.ic.webservices.ageriskscoring.AgeRiskScoring getAgeRiskScoring() {
    if (ageRiskScoring == null)
      _initAgeRiskScoringProxy();
    return ageRiskScoring;
  }
  
  public java.lang.Double calcular(java.lang.Integer idade) throws java.rmi.RemoteException{
    if (ageRiskScoring == null)
      _initAgeRiskScoringProxy();
    return ageRiskScoring.calcular(idade);
  }
  
  
}