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
 * <p>Clase Java para fundComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="fundComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fundID" type="{http://ifrs.vodafone.com/commonTypes_v3}fundIDType"/&gt;
 *         &lt;element name="fundStartDate" type="{http://ifrs.vodafone.com/commonTypes_v3}fundDateType"/&gt;
 *         &lt;element name="fundEndDate" type="{http://ifrs.vodafone.com/commonTypes_v3}fundDateType"/&gt;
 *         &lt;element name="fundType" type="{http://ifrs.vodafone.com/commonTypes_v3}fundTypeType"/&gt;
 *         &lt;element name="fundAmount" type="{http://ifrs.vodafone.com/commonTypes_v3}fundAmountType" minOccurs="0"/&gt;
 *         &lt;element name="amountOfTechFundUtilisedByCustomerExpected" type="{http://ifrs.vodafone.com/commonTypes_v3}amountOfTechFundUtilisedByCustomerExpectedType" minOccurs="0"/&gt;
 *         &lt;element name="profitCenter" type="{http://ifrs.vodafone.com/commonTypes_v3}profitCenterType"/&gt;
 *         &lt;element name="referenceAccount" type="{http://ifrs.vodafone.com/commonTypes_v3}referenceAccountType" minOccurs="0"/&gt;
 *         &lt;element name="pOBName" type="{http://ifrs.vodafone.com/commonTypes_v3}pOBNameType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fundComplexType", propOrder = {
    "fundID",
    "fundStartDate",
    "fundEndDate",
    "fundType",
    "fundAmount",
    "amountOfTechFundUtilisedByCustomerExpected",
    "profitCenter",
    "referenceAccount",
    "pobName"
})
public class FundComplexType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fundID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fundStartDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fundEndDate;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fundType;
    protected BigDecimal fundAmount;
    protected BigDecimal amountOfTechFundUtilisedByCustomerExpected;
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

    /**
     * Obtiene el valor de la propiedad fundID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundID() {
        return fundID;
    }

    /**
     * Define el valor de la propiedad fundID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundID(String value) {
        this.fundID = value;
    }

    /**
     * Obtiene el valor de la propiedad fundStartDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFundStartDate() {
        return fundStartDate;
    }

    /**
     * Define el valor de la propiedad fundStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFundStartDate(XMLGregorianCalendar value) {
        this.fundStartDate = value;
    }

    /**
     * Obtiene el valor de la propiedad fundEndDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFundEndDate() {
        return fundEndDate;
    }

    /**
     * Define el valor de la propiedad fundEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFundEndDate(XMLGregorianCalendar value) {
        this.fundEndDate = value;
    }

    /**
     * Obtiene el valor de la propiedad fundType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundType() {
        return fundType;
    }

    /**
     * Define el valor de la propiedad fundType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundType(String value) {
        this.fundType = value;
    }

    /**
     * Obtiene el valor de la propiedad fundAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFundAmount() {
        return fundAmount;
    }

    /**
     * Define el valor de la propiedad fundAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFundAmount(BigDecimal value) {
        this.fundAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad amountOfTechFundUtilisedByCustomerExpected.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountOfTechFundUtilisedByCustomerExpected() {
        return amountOfTechFundUtilisedByCustomerExpected;
    }

    /**
     * Define el valor de la propiedad amountOfTechFundUtilisedByCustomerExpected.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountOfTechFundUtilisedByCustomerExpected(BigDecimal value) {
        this.amountOfTechFundUtilisedByCustomerExpected = value;
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

}
