//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.28 a las 01:22:06 PM CEST 
//


package com.vsf.S15.AddGoods;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para materialRightsComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="materialRightsComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="materialRightCode" type="{http://ifrs.vodafone.com/commonTypes_v3}materialRightCodeType"/&gt;
 *         &lt;element name="materialRightID" type="{http://ifrs.vodafone.com/commonTypes_v3}materialRightIDType"/&gt;
 *         &lt;element name="materialRightStartDate" type="{http://ifrs.vodafone.com/commonTypes_v3}materialRightDateType"/&gt;
 *         &lt;element name="materialRightEndDate" type="{http://ifrs.vodafone.com/commonTypes_v3}materialRightDateType"/&gt;
 *         &lt;element name="companyCode" type="{http://ifrs.vodafone.com/commonTypes_v3}companyCodeType" minOccurs="0"/&gt;
 *         &lt;element name="materialRightValue" type="{http://ifrs.vodafone.com/commonTypes_v3}materialRightValueType"/&gt;
 *         &lt;element name="likelihoodOfExcercise" type="{http://ifrs.vodafone.com/commonTypes_v3}likelihoodOfExcerciseType"/&gt;
 *         &lt;element name="timeLimit" type="{http://ifrs.vodafone.com/commonTypes_v3}timeLimitType"/&gt;
 *         &lt;element name="lMSpecificMiDimensions" type="{http://ifrs.vodafone.com/commonTypes_v3}lMSpecificMiDimensionsType" minOccurs="0"/&gt;
 *         &lt;element name="profitCenter" type="{http://ifrs.vodafone.com/commonTypes_v3}profitCenterType"/&gt;
 *         &lt;element name="MIAttributes" type="{http://ifrs15.vodafone.com/events/addgoodsservices_v3}mIAttributesComplexType" minOccurs="0"/&gt;
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
@XmlType(name = "materialRightsComplexType", propOrder = {
    "materialRightCode",
    "materialRightID",
    "materialRightStartDate",
    "materialRightEndDate",
    "companyCode",
    "materialRightValue",
    "likelihoodOfExcercise",
    "timeLimit",
    "lmSpecificMiDimensions",
    "profitCenter",
    "miAttributes",
    "referenceAccount",
    "pobName"
})
public class MaterialRightsComplexType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String materialRightCode;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String materialRightID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar materialRightStartDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar materialRightEndDate;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyCode;
    @XmlElement(required = true)
    protected BigDecimal materialRightValue;
    @XmlElement(required = true)
    protected BigDecimal likelihoodOfExcercise;
    @XmlElement(required = true)
    protected BigInteger timeLimit;
    @XmlElement(name = "lMSpecificMiDimensions")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lmSpecificMiDimensions;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String profitCenter;
    @XmlElement(name = "MIAttributes")
    protected MIAttributesComplexType miAttributes;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String referenceAccount;
    @XmlElement(name = "pOBName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String pobName;

    /**
     * Obtiene el valor de la propiedad materialRightCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialRightCode() {
        return materialRightCode;
    }

    /**
     * Define el valor de la propiedad materialRightCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialRightCode(String value) {
        this.materialRightCode = value;
    }

    /**
     * Obtiene el valor de la propiedad materialRightID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialRightID() {
        return materialRightID;
    }

    /**
     * Define el valor de la propiedad materialRightID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialRightID(String value) {
        this.materialRightID = value;
    }

    /**
     * Obtiene el valor de la propiedad materialRightStartDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaterialRightStartDate() {
        return materialRightStartDate;
    }

    /**
     * Define el valor de la propiedad materialRightStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaterialRightStartDate(XMLGregorianCalendar value) {
        this.materialRightStartDate = value;
    }

    /**
     * Obtiene el valor de la propiedad materialRightEndDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaterialRightEndDate() {
        return materialRightEndDate;
    }

    /**
     * Define el valor de la propiedad materialRightEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaterialRightEndDate(XMLGregorianCalendar value) {
        this.materialRightEndDate = value;
    }

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
     * Obtiene el valor de la propiedad materialRightValue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaterialRightValue() {
        return materialRightValue;
    }

    /**
     * Define el valor de la propiedad materialRightValue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaterialRightValue(BigDecimal value) {
        this.materialRightValue = value;
    }

    /**
     * Obtiene el valor de la propiedad likelihoodOfExcercise.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLikelihoodOfExcercise() {
        return likelihoodOfExcercise;
    }

    /**
     * Define el valor de la propiedad likelihoodOfExcercise.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLikelihoodOfExcercise(BigDecimal value) {
        this.likelihoodOfExcercise = value;
    }

    /**
     * Obtiene el valor de la propiedad timeLimit.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeLimit() {
        return timeLimit;
    }

    /**
     * Define el valor de la propiedad timeLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeLimit(BigInteger value) {
        this.timeLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad lmSpecificMiDimensions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLMSpecificMiDimensions() {
        return lmSpecificMiDimensions;
    }

    /**
     * Define el valor de la propiedad lmSpecificMiDimensions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLMSpecificMiDimensions(String value) {
        this.lmSpecificMiDimensions = value;
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
     * Obtiene el valor de la propiedad miAttributes.
     * 
     * @return
     *     possible object is
     *     {@link MIAttributesComplexType }
     *     
     */
    public MIAttributesComplexType getMIAttributes() {
        return miAttributes;
    }

    /**
     * Define el valor de la propiedad miAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link MIAttributesComplexType }
     *     
     */
    public void setMIAttributes(MIAttributesComplexType value) {
        this.miAttributes = value;
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
