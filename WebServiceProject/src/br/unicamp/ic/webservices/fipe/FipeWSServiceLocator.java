/**
 * FipeWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.unicamp.ic.webservices.fipe;

public class FipeWSServiceLocator extends org.apache.axis.client.Service implements br.unicamp.ic.webservices.fipe.FipeWSService {

    public FipeWSServiceLocator() {
    }


    public FipeWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FipeWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FipePort
    private java.lang.String FipePort_address = "http://unicamp-soa-webservices.appspot.com/fipe";

    public java.lang.String getFipePortAddress() {
        return FipePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FipePortWSDDServiceName = "FipePort";

    public java.lang.String getFipePortWSDDServiceName() {
        return FipePortWSDDServiceName;
    }

    public void setFipePortWSDDServiceName(java.lang.String name) {
        FipePortWSDDServiceName = name;
    }

    public br.unicamp.ic.webservices.fipe.Fipe getFipePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FipePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFipePort(endpoint);
    }

    public br.unicamp.ic.webservices.fipe.Fipe getFipePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.unicamp.ic.webservices.fipe.FipePortBindingStub _stub = new br.unicamp.ic.webservices.fipe.FipePortBindingStub(portAddress, this);
            _stub.setPortName(getFipePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFipePortEndpointAddress(java.lang.String address) {
        FipePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.unicamp.ic.webservices.fipe.Fipe.class.isAssignableFrom(serviceEndpointInterface)) {
                br.unicamp.ic.webservices.fipe.FipePortBindingStub _stub = new br.unicamp.ic.webservices.fipe.FipePortBindingStub(new java.net.URL(FipePort_address), this);
                _stub.setPortName(getFipePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("FipePort".equals(inputPortName)) {
            return getFipePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://fipe.webservices.ic.unicamp.br/", "FipeWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://fipe.webservices.ic.unicamp.br/", "FipePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FipePort".equals(portName)) {
            setFipePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
