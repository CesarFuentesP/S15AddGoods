//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.06 a las 09:49:38 AM CEST 
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
 * <p>Clase Java para ContractLevelComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ContractLevelComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="costCode" type="{http://ifrs.vodafone.com/commonTypes_v3}costCodeType"/&gt;
 *         &lt;element name="costID" type="{http://ifrs.vodafone.com/commonTypes_v3}costIDType"/&gt;
 *         &lt;element name="costAmount" type="{http://ifrs.vodafone.com/commonTypes_v3}costAmountType"/&gt;
 *         &lt;element name="referenceAccount" type="{http://ifrs.vodafone.com/commonTypes_v3}referenceAccountType" minOccurs="0"/&gt;
 *         &lt;element name="pOBName" type="{http://ifrs.vodafone.com/commonTypes_v3}pOBNameType" minOccurs="0"/&gt;
 *         &lt;element name="costStartDate" type="{http://ifrs.vodafone.com/commonTypes_v3}costStartDateType" minOccurs="0"/&gt;
 *         &lt;element name="costEndDate" type="{http://ifrs.vodafone.com/commonTypes_v3}costEndDateType" minOccurs="0"/&gt;
 *         &lt;element name="profitCenter" type="{http://ifrs.vodafone.com/commonTypes_v3}profitCenterType" minOccurs="0"/&gt;
 *         &lt;element name="costCenter" type="{http://ifrs.vodafone.com/commonTypes_v3}costCenterType" minOccurs="0"/&gt;
 *         &lt;element name="internalOrder" type="{http://ifrs.vodafone.com/commonTypes_v3}internalOrderType" minOccurs="0"/&gt;
 *         &lt;element name="costFunctionalArea" type="{http://ifrs.vodafone.com/commonTypes_v3}costFunctionalAreaType" minOccurs="0"/&gt;
 *         &lt;element name="wBSDimentions" type="{http://ifrs.vodafone.com/commonTypes_v3}wBSDimentionsType" minOccurs="0"/&gt;
 *         &lt;element name="lMSpecificMiDimensions" type="{http://ifrs.vodafone.com/commonTypes_v3}lMSpecificMiDimensionsType" minOccurs="0"/&gt;
 *         &lt;element name="MIAttributes" type="{http://ifrs15.vodafone.com/events/addgoodsservices_v3}mIAttributesComplexType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractLevelComplexType", propOrder = {
    "costCode",
    "costID",
    "costAmount",
    "referenceAccount",
    "pobName",
    "costStartDate",
    "costEndDate",
    "profitCenter",
    "costCenter",
    "internalOrder",
    "costFunctionalArea",
    "wbsDimentions",
    "lmSpecificMiDimensions",
    "miAttributes"
})
public class ContractLevelComplexType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String costCode;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String costID;
    @XmlElement(required = true)
    protected BigDecimal costAmount;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String referenceAccount;
    @XmlElement(name = "pOBName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String pobName;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar costStartDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar costEndDate;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String profitCenter;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String costCenter;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String internalOrder;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String costFunctionalArea;
    @XmlElement(name = "wBSDimentions")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String wbsDimentions;
    @XmlElement(name = "lMSpecificMiDimensions")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lmSpecificMiDimensions;
    @XmlElement(name = "MIAttributes")
    protected MIAttributesComplexType miAttributes;

    /**
     * Obtiene el valor de la propiedad costCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCode() {
        return costCode;
    }

    /**
     * Define el valor de la propiedad costCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCode(String value) {
        this.costCode = value;
    }

    /**
     * Obtiene el valor de la propiedad costID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostID() {
        return costID;
    }

    /**
     * Define el valor de la propiedad costID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostID(String value) {
        this.costID = value;
    }

    /**
     * Obtiene el valor de la propiedad costAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostAmount() {
        return costAmount;
    }

    /**
     * Define el valor de la propiedad costAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostAmount(BigDecimal value) {
        this.costAmount = value;
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
     * Obtiene el valor de la propiedad costStartDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCostStartDate() {
        return costStartDate;
    }

    /**
     * Define el valor de la propiedad costStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCostStartDate(XMLGregorianCalendar value) {
        this.costStartDate = value;
    }

    /**
     * Obtiene el valor de la propiedad costEndDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCostEndDate() {
        return costEndDate;
    }

    /**
     * Define el valor de la propiedad costEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCostEndDate(XMLGregorianCalendar value) {
        this.costEndDate = value;
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
     * Obtiene el valor de la propiedad costCenter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenter() {
        return costCenter;
    }

    /**
     * Define el valor de la propiedad costCenter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenter(String value) {
        this.costCenter = value;
    }

    /**
     * Obtiene el valor de la propiedad internalOrder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalOrder() {
        return internalOrder;
    }

    /**
     * Define el valor de la propiedad internalOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalOrder(String value) {
        this.internalOrder = value;
    }

    /**
     * Obtiene el valor de la propiedad costFunctionalArea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostFunctionalArea() {
        return costFunctionalArea;
    }

    /**
     * Define el valor de la propiedad costFunctionalArea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostFunctionalArea(String value) {
        this.costFunctionalArea = value;
    }

    /**
     * Obtiene el valor de la propiedad wbsDimentions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWBSDimentions() {
        return wbsDimentions;
    }

    /**
     * Define el valor de la propiedad wbsDimentions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWBSDimentions(String value) {
        this.wbsDimentions = value;
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

}
