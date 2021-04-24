/**
 * TabelaFipe.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.unicamp.ic.webservices.fipe;

public class TabelaFipe  implements java.io.Serializable {
    private java.lang.Integer anoModelo;

    private java.lang.String marca;

    private java.lang.String modelo;

    private java.lang.Double preco;

    public TabelaFipe() {
    }

    public TabelaFipe(
           java.lang.Integer anoModelo,
           java.lang.String marca,
           java.lang.String modelo,
           java.lang.Double preco) {
           this.anoModelo = anoModelo;
           this.marca = marca;
           this.modelo = modelo;
           this.preco = preco;
    }


    /**
     * Gets the anoModelo value for this TabelaFipe.
     * 
     * @return anoModelo
     */
    public java.lang.Integer getAnoModelo() {
        return anoModelo;
    }


    /**
     * Sets the anoModelo value for this TabelaFipe.
     * 
     * @param anoModelo
     */
    public void setAnoModelo(java.lang.Integer anoModelo) {
        this.anoModelo = anoModelo;
    }


    /**
     * Gets the marca value for this TabelaFipe.
     * 
     * @return marca
     */
    public java.lang.String getMarca() {
        return marca;
    }


    /**
     * Sets the marca value for this TabelaFipe.
     * 
     * @param marca
     */
    public void setMarca(java.lang.String marca) {
        this.marca = marca;
    }


    /**
     * Gets the modelo value for this TabelaFipe.
     * 
     * @return modelo
     */
    public java.lang.String getModelo() {
        return modelo;
    }


    /**
     * Sets the modelo value for this TabelaFipe.
     * 
     * @param modelo
     */
    public void setModelo(java.lang.String modelo) {
        this.modelo = modelo;
    }


    /**
     * Gets the preco value for this TabelaFipe.
     * 
     * @return preco
     */
    public java.lang.Double getPreco() {
        return preco;
    }


    /**
     * Sets the preco value for this TabelaFipe.
     * 
     * @param preco
     */
    public void setPreco(java.lang.Double preco) {
        this.preco = preco;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TabelaFipe)) return false;
        TabelaFipe other = (TabelaFipe) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.anoModelo==null && other.getAnoModelo()==null) || 
             (this.anoModelo!=null &&
              this.anoModelo.equals(other.getAnoModelo()))) &&
            ((this.marca==null && other.getMarca()==null) || 
             (this.marca!=null &&
              this.marca.equals(other.getMarca()))) &&
            ((this.modelo==null && other.getModelo()==null) || 
             (this.modelo!=null &&
              this.modelo.equals(other.getModelo()))) &&
            ((this.preco==null && other.getPreco()==null) || 
             (this.preco!=null &&
              this.preco.equals(other.getPreco())));
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
        if (getAnoModelo() != null) {
            _hashCode += getAnoModelo().hashCode();
        }
        if (getMarca() != null) {
            _hashCode += getMarca().hashCode();
        }
        if (getModelo() != null) {
            _hashCode += getModelo().hashCode();
        }
        if (getPreco() != null) {
            _hashCode += getPreco().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TabelaFipe.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fipe.webservices.ic.unicamp.br/", "tabelaFipe"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anoModelo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anoModelo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marca");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modelo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preco");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preco"));
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
