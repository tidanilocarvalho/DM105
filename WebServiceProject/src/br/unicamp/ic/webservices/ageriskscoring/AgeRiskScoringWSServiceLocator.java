/**
 * AgeRiskScoringWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.unicamp.ic.webservices.ageriskscoring;

public class AgeRiskScoringWSServiceLocator extends org.apache.axis.client.Service implements br.unicamp.ic.webservices.ageriskscoring.AgeRiskScoringWSService {

    public AgeRiskScoringWSServiceLocator() {
    }


    public AgeRiskScoringWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AgeRiskScoringWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AgeRiskScoringPort
    private java.lang.String AgeRiskScoringPort_address = "http://soa-unicamp-2012.appspot.com/ageriskscoring";

    public java.lang.String getAgeRiskScoringPortAddress() {
        return AgeRiskScoringPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AgeRiskScoringPortWSDDServiceName = "AgeRiskScoringPort";

    public java.lang.String getAgeRiskScoringPortWSDDServiceName() {
        return AgeRiskScoringPortWSDDServiceName;
    }

    public void setAgeRiskScoringPortWSDDServiceName(java.lang.String name) {
        AgeRiskScoringPortWSDDServiceName = name;
    }

    public br.unicamp.ic.webservices.ageriskscoring.AgeRiskScoring getAgeRiskScoringPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AgeRiskScoringPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAgeRiskScoringPort(endpoint);
    }

    public br.unicamp.ic.webservices.ageriskscoring.AgeRiskScoring getAgeRiskScoringPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.unicamp.ic.webservices.ageriskscoring.AgeRiskScoringPortBindingStub _stub = new br.unicamp.ic.webservices.ageriskscoring.AgeRiskScoringPortBindingStub(portAddress, this);
            _stub.setPortName(getAgeRiskScoringPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAgeRiskScoringPortEndpointAddress(java.lang.String address) {
        AgeRiskScoringPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.unicamp.ic.webservices.ageriskscoring.AgeRiskScoring.class.isAssignableFrom(serviceEndpointInterface)) {
                br.unicamp.ic.webservices.ageriskscoring.AgeRiskScoringPortBindingStub _stub = new br.unicamp.ic.webservices.ageriskscoring.AgeRiskScoringPortBindingStub(new java.net.URL(AgeRiskScoringPort_address), this);
                _stub.setPortName(getAgeRiskScoringPortWSDDServiceName());
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
        if ("AgeRiskScoringPort".equals(inputPortName)) {
            return getAgeRiskScoringPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ageriskscoring.webservices.ic.unicamp.br/", "AgeRiskScoringWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ageriskscoring.webservices.ic.unicamp.br/", "AgeRiskScoringPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AgeRiskScoringPort".equals(portName)) {
            setAgeRiskScoringPortEndpointAddress(address);
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
