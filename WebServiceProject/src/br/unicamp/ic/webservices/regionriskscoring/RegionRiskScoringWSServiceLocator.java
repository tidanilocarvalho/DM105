/**
 * RegionRiskScoringWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.unicamp.ic.webservices.regionriskscoring;

public class RegionRiskScoringWSServiceLocator extends org.apache.axis.client.Service implements br.unicamp.ic.webservices.regionriskscoring.RegionRiskScoringWSService {

    public RegionRiskScoringWSServiceLocator() {
    }


    public RegionRiskScoringWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RegionRiskScoringWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RegionRiskScoringPort
    private java.lang.String RegionRiskScoringPort_address = "http://soa-unicamp-2012.appspot.com/regionriskscoring";

    public java.lang.String getRegionRiskScoringPortAddress() {
        return RegionRiskScoringPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RegionRiskScoringPortWSDDServiceName = "RegionRiskScoringPort";

    public java.lang.String getRegionRiskScoringPortWSDDServiceName() {
        return RegionRiskScoringPortWSDDServiceName;
    }

    public void setRegionRiskScoringPortWSDDServiceName(java.lang.String name) {
        RegionRiskScoringPortWSDDServiceName = name;
    }

    public br.unicamp.ic.webservices.regionriskscoring.RegionRiskScoring getRegionRiskScoringPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RegionRiskScoringPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRegionRiskScoringPort(endpoint);
    }

    public br.unicamp.ic.webservices.regionriskscoring.RegionRiskScoring getRegionRiskScoringPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.unicamp.ic.webservices.regionriskscoring.RegionRiskScoringPortBindingStub _stub = new br.unicamp.ic.webservices.regionriskscoring.RegionRiskScoringPortBindingStub(portAddress, this);
            _stub.setPortName(getRegionRiskScoringPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRegionRiskScoringPortEndpointAddress(java.lang.String address) {
        RegionRiskScoringPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.unicamp.ic.webservices.regionriskscoring.RegionRiskScoring.class.isAssignableFrom(serviceEndpointInterface)) {
                br.unicamp.ic.webservices.regionriskscoring.RegionRiskScoringPortBindingStub _stub = new br.unicamp.ic.webservices.regionriskscoring.RegionRiskScoringPortBindingStub(new java.net.URL(RegionRiskScoringPort_address), this);
                _stub.setPortName(getRegionRiskScoringPortWSDDServiceName());
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
        if ("RegionRiskScoringPort".equals(inputPortName)) {
            return getRegionRiskScoringPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://regionriskscoring.webservices.ic.unicamp.br/", "RegionRiskScoringWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://regionriskscoring.webservices.ic.unicamp.br/", "RegionRiskScoringPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RegionRiskScoringPort".equals(portName)) {
            setRegionRiskScoringPortEndpointAddress(address);
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
