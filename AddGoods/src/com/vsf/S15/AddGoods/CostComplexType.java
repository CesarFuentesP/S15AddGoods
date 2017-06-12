//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.06 a las 09:49:38 AM CEST 
//


package com.vsf.S15.AddGoods;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para CostComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CostComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="companyCode" type="{http://ifrs.vodafone.com/commonTypes_v3}companyCodeType" minOccurs="0"/&gt;
 *         &lt;element name="costTransferDate" type="{http://ifrs.vodafone.com/commonTypes_v3}costTransferDateType" minOccurs="0"/&gt;
 *         &lt;element name="ContractLevels" type="{http://ifrs15.vodafone.com/events/addgoodsservices_v3}ContractLevelListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="POBLevels" type="{http://ifrs15.vodafone.com/events/addgoodsservices_v3}POBLevelListComplexType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostComplexType", propOrder = {
    "companyCode",
    "costTransferDate",
    "contractLevels",
    "pobLevels"
})
public class CostComplexType {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyCode;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar costTransferDate;
    @XmlElement(name = "ContractLevels")
    protected ContractLevelListComplexType contractLevels;
    @XmlElement(name = "POBLevels")
    protected POBLevelListComplexType pobLevels;

    /**
     * Obtiene el valor de la propiedad companyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Define el valor de la propiedad companyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad costTransferDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCostTransferDate() {
        return costTransferDate;
    }

    /**
     * Define el valor de la propiedad costTransferDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCostTransferDate(XMLGregorianCalendar value) {
        this.costTransferDate = value;
    }

    /**
     * Obtiene el valor de la propiedad contractLevels.
     * 
     * @return
     *     possible object is
     *     {@link ContractLevelListComplexType }
     *     
     */
    public ContractLevelListComplexType getContractLevels() {
        return contractLevels;
    }

    /**
     * Define el valor de la propiedad contractLevels.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractLevelListComplexType }
     *     
     */
    public void setContractLevels(ContractLevelListComplexType value) {
        this.contractLevels = value;
    }

    /**
     * Obtiene el valor de la propiedad pobLevels.
     * 
     * @return
     *     possible object is
     *     {@link POBLevelListComplexType }
     *     
     */
    public POBLevelListComplexType getPOBLevels() {
        return pobLevels;
    }

    /**
     * Define el valor de la propiedad pobLevels.
     * 
     * @param value
     *     allowed object is
     *     {@link POBLevelListComplexType }
     *     
     */
    public void setPOBLevels(POBLevelListComplexType value) {
        this.pobLevels = value;
    }

}
