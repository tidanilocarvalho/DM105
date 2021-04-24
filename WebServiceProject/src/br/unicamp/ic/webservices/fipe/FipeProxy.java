package br.unicamp.ic.webservices.fipe;

public class FipeProxy implements br.unicamp.ic.webservices.fipe.Fipe {
  private String _endpoint = null;
  private br.unicamp.ic.webservices.fipe.Fipe fipe = null;
  
  public FipeProxy() {
    _initFipeProxy();
  }
  
  public FipeProxy(String endpoint) {
    _endpoint = endpoint;
    _initFipeProxy();
  }
  
  private void _initFipeProxy() {
    try {
      fipe = (new br.unicamp.ic.webservices.fipe.FipeWSServiceLocator()).getFipePort();
      if (fipe != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)fipe)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)fipe)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (fipe != null)
      ((javax.xml.rpc.Stub)fipe)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.unicamp.ic.webservices.fipe.Fipe getFipe() {
    if (fipe == null)
      _initFipeProxy();
    return fipe;
  }
  
  public br.unicamp.ic.webservices.fipe.TabelaFipe pesquisar(java.lang.String marca, java.lang.String modelo, java.lang.Integer anoModelo) throws java.rmi.RemoteException{
    if (fipe == null)
      _initFipeProxy();
    return fipe.pesquisar(marca, modelo, anoModelo);
  }
  
  
}