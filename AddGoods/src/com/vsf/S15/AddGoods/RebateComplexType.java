//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.28 a las 01:22:06 PM CEST 
//


package com.vsf.S15.AddGoods;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para rebateComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="rebateComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rebateID" type="{http://ifrs.vodafone.com/commonTypes_v3}rebateIDType"/&gt;
 *         &lt;element name="rebateStartDate" type="{http://ifrs.vodafone.com/commonTypes_v3}rebateDateType"/&gt;
 *         &lt;element name="rebateEndDate" type="{http://ifrs.vodafone.com/commonTypes_v3}rebateDateType"/&gt;
 *         &lt;element name="annualRebateValue" type="{http://ifrs.vodafone.com/commonTypes_v3}annualRebateValueType"/&gt;
 *         &lt;element name="profitCenter" type="{http://ifrs.vodafone.com/commonTypes_v3}profitCenterType"/&gt;
 *         &lt;element name="referenceAccount" type="{http://ifrs.vodafone.com/commonTypes_v3}referenceAccountType" minOccurs="0"/&gt;
 *         &lt;element name="pOBName" type="{http://ifrs.vodafone.com/commonTypes_v3}pOBNameType" minOccurs="0"/&gt;
 *         &lt;element name="rebateType" type="{http://ifrs.vodafone.com/commonTypes_v3}rebateTypeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rebateComplexType", propOrder = {
    "rebateID",
    "rebateStartDate",
    "rebateEndDate",
    "annualRebateValue",
    "profitCenter",
    "referenceAccount",
    "pobName",
    "rebateType"
})
public class RebateComplexType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String rebateID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rebateStartDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rebateEndDate;
    @XmlElement(required = true)
    protected BigDecimal annualRebateValue;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String profitCenter;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String referenceAccount;
    @XmlElement(name = "pOBName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String pobName;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String rebateType;

    /**
     * Obtiene el valor de la propiedad rebateID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebateID() {
        return rebateID;
    }

    /**
     * Define el valor de la propiedad rebateID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebateID(String value) {
        this.rebateID = value;
    }

    /**
     * Obtiene el valor de la propiedad rebateStartDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRebateStartDate() {
        return rebateStartDate;
    }

    /**
     * Define el valor de la propiedad rebateStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRebateStartDate(XMLGregorianCalendar value) {
        this.rebateStartDate = value;
    }

    /**
     * Obtiene el valor de la propiedad rebateEndDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRebateEndDate() {
        return rebateEndDate;
    }

    /**
     * Define el valor de la propiedad rebateEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRebateEndDate(XMLGregorianCalendar value) {
        this.rebateEndDate = value;
    }

    /**
     * Obtiene el valor de la propiedad annualRebateValue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnnualRebateValue() {
        return annualRebateValue;
    }

    /**
     * Define el valor de la propiedad annualRebateValue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnnualRebateValue(BigDecimal value) {
        this.annualRebateValue = value;
    }

    /**
     * Obtiene el valor de la propiedad profitCenter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitCenter() {
        return profitCenter;
    }

    /**
     * Define el valor de la propiedad profitCenter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitCenter(String value) {
        this.profitCenter = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceAccount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceAccount() {
        return referenceAccount;
    }

    /**
     * Define el valor de la propiedad referenceAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceAccount(String value) {
        this.referenceAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad pobName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBName() {
        return pobName;
    }

    /**
     * Define el valor de la propiedad pobName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBName(String value) {
        this.pobName = value;
    }

    /**
     * Obtiene el valor de la propiedad rebateType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebateType() {
        return rebateType;
    }

    /**
     * Define el valor de la propiedad rebateType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebateType(String value) {
        this.rebateType = value;
    }

}
