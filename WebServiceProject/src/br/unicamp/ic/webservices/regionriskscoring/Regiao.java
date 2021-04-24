/**
 * Regiao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.unicamp.ic.webservices.regionriskscoring;

public class Regiao  implements java.io.Serializable {
    private java.lang.Integer numero;

    private java.lang.String regiao;

    private java.lang.Double regionRiskScoring;

    public Regiao() {
    }

    public Regiao(
           java.lang.Integer numero,
           java.lang.String regiao,
           java.lang.Double regionRiskScoring) {
           this.numero = numero;
           this.regiao = regiao;
           this.regionRiskScoring = regionRiskScoring;
    }


    /**
     * Gets the numero value for this Regiao.
     * 
     * @return numero
     */
    public java.lang.Integer getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this Regiao.
     * 
     * @param numero
     */
    public void setNumero(java.lang.Integer numero) {
        this.numero = numero;
    }


    /**
     * Gets the regiao value for this Regiao.
     * 
     * @return regiao
     */
    public java.lang.String getRegiao() {
        return regiao;
    }


    /**
     * Sets the regiao value for this Regiao.
     * 
     * @param regiao
     */
    public void setRegiao(java.lang.String regiao) {
        this.regiao = regiao;
    }


    /**
     * Gets the regionRiskScoring value for this Regiao.
     * 
     * @return regionRiskScoring
     */
    public java.lang.Double getRegionRiskScoring() {
        return regionRiskScoring;
    }


    /**
     * Sets the regionRiskScoring value for this Regiao.
     * 
     * @param regionRiskScoring
     */
    public void setRegionRiskScoring(java.lang.Double regionRiskScoring) {
        this.regionRiskScoring = regionRiskScoring;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Regiao)) return false;
        Regiao other = (Regiao) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            ((this.regiao==null && other.getRegiao()==null) || 
             (this.regiao!=null &&
              this.regiao.equals(other.getRegiao()))) &&
            ((this.regionRiskScoring==null && other.getRegionRiskScoring()==null) || 
             (this.regionRiskScoring!=null &&
              this.regionRiskScoring.equals(other.getRegionRiskScoring())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        if (getRegiao() != null) {
            _hashCode += getRegiao().hashCode();
        }
        if (getRegionRiskScoring() != null) {
            _hashCode += getRegionRiskScoring().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Regiao.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://regionriskscoring.webservices.ic.unicamp.br/", "regiao"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regiao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regiao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionRiskScoring");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regionRiskScoring"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
