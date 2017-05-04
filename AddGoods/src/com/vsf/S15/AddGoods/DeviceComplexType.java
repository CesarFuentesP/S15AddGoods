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
 * <p>Clase Java para deviceComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="deviceComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceCode" type="{http://ifrs.vodafone.com/commonTypes_v3}deviceCodeType"/&gt;
 *         &lt;element name="deviceID" type="{http://ifrs.vodafone.com/commonTypes_v3}deviceIDType"/&gt;
 *         &lt;element name="deviceTimeUnit" type="{http://ifrs.vodafone.com/commonTypes_v3}deviceTimeUnitType" minOccurs="0"/&gt;
 *         &lt;element name="deviceTransferDate" type="{http://ifrs.vodafone.com/commonTypes_v3}deviceTransferDateType" minOccurs="0"/&gt;
 *         &lt;element name="deviceStartDate" type="{http://ifrs.vodafone.com/commonTypes_v3}deviceStartDateType" minOccurs="0"/&gt;
 *         &lt;element name="deviceEndDate" type="{http://ifrs.vodafone.com/commonTypes_v3}deviceEndDateType" minOccurs="0"/&gt;
 *         &lt;element name="DeviceBillingProfile" type="{http://ifrs15.vodafone.com/events/addgoodsservices_v3}deviceBillingProfileComplexType" minOccurs="0"/&gt;
 *         &lt;element name="OneOffPayments" type="{http://ifrs15.vodafone.com/events/addgoodsservices_v3}oneOffPaymentListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="financingDiscountRate" type="{http://ifrs.vodafone.com/commonTypes_v3}financingDiscountRateType" minOccurs="0"/&gt;
 *         &lt;element name="lMSpecificMiDimensions" type="{http://ifrs.vodafone.com/commonTypes_v3}lMSpecificMiDimensionsType" minOccurs="0"/&gt;
 *         &lt;element name="MIAttributes" type="{http://ifrs15.vodafone.com/events/addgoodsservices_v3}mIAttributesComplexType" minOccurs="0"/&gt;
 *         &lt;element name="sSP" type="{http://ifrs.vodafone.com/commonTypes_v3}sSPType"/&gt;
 *         &lt;element name="discountIndicator" type="{http://ifrs.vodafone.com/commonTypes_v3}discountIndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="deviceQuantity" type="{http://ifrs.vodafone.com/commonTypes_v3}deviceQuantityType"/&gt;
 *         &lt;element name="companyCode" type="{http://ifrs.vodafone.com/commonTypes_v3}companyCodeType" minOccurs="0"/&gt;
 *         &lt;element name="firstPlanBillingDate" type="{http://ifrs.vodafone.com/commonTypes_v3}firstPlanBillingDateType" minOccurs="0"/&gt;
 *         &lt;element name="profitCenter" type="{http://ifrs.vodafone.com/commonTypes_v3}profitCenterType"/&gt;
 *         &lt;element name="excludeFromAllocation" type="{http://ifrs.vodafone.com/commonTypes_v3}excludeFromAllocationType" minOccurs="0"/&gt;
 *         &lt;element name="referenceAccount" type="{http://ifrs.vodafone.com/commonTypes_v3}referenceAccountType" minOccurs="0"/&gt;
 *         &lt;element name="pOBName" type="{http://ifrs.vodafone.com/commonTypes_v3}pOBNameType" minOccurs="0"/&gt;
 *         &lt;element name="billingType" type="{http://ifrs.vodafone.com/commonTypes_v3}billingTypeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deviceComplexType", propOrder = {
    "deviceCode",
    "deviceID",
    "deviceTimeUnit",
    "deviceTransferDate",
    "deviceStartDate",
    "deviceEndDate",
    "deviceBillingProfile",
    "oneOffPayments",
    "financingDiscountRate",
    "lmSpecificMiDimensions",
    "miAttributes",
    "ssp",
    "discountIndicator",
    "deviceQuantity",
    "companyCode",
    "firstPlanBillingDate",
    "profitCenter",
    "excludeFromAllocation",
    "referenceAccount",
    "pobName",
    "billingType"
})
public class DeviceComplexType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deviceCode;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deviceID;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deviceTimeUnit;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deviceTransferDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deviceStartDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deviceEndDate;
    @XmlElement(name = "DeviceBillingProfile")
    protected DeviceBillingProfileComplexType deviceBillingProfile;
    @XmlElement(name = "OneOffPayments")
    protected OneOffPaymentListComplexType oneOffPayments;
    protected BigDecimal financingDiscountRate;
    @XmlElement(name = "lMSpecificMiDimensions")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lmSpecificMiDimensions;
    @XmlElement(name = "MIAttributes")
    protected MIAttributesComplexType miAttributes;
    @XmlElement(name = "sSP", required = true)
    protected BigDecimal ssp;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String discountIndicator;
    @XmlElement(required = true)
    protected BigInteger deviceQuantity;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyCode;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstPlanBillingDate;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String profitCenter;
    protected String excludeFromAllocation;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String referenceAccount;
    @XmlElement(name = "pOBName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String pobName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String billingType;

    /**
     * Obtiene el valor de la propiedad deviceCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceCode() {
        return deviceCode;
    }

    /**
     * Define el valor de la propiedad deviceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceCode(String value) {
        this.deviceCode = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceID() {
        return deviceID;
    }

    /**
     * Define el valor de la propiedad deviceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceID(String value) {
        this.deviceID = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceTimeUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceTimeUnit() {
        return deviceTimeUnit;
    }

    /**
     * Define el valor de la propiedad deviceTimeUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceTimeUnit(String value) {
        this.deviceTimeUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceTransferDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeviceTransferDate() {
        return deviceTransferDate;
    }

    /**
     * Define el valor de la propiedad deviceTransferDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeviceTransferDate(XMLGregorianCalendar value) {
        this.deviceTransferDate = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceStartDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeviceStartDate() {
        return deviceStartDate;
    }

    /**
     * Define el valor de la propiedad deviceStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeviceStartDate(XMLGregorianCalendar value) {
        this.deviceStartDate = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceEndDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeviceEndDate() {
        return deviceEndDate;
    }

    /**
     * Define el valor de la propiedad deviceEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeviceEndDate(XMLGregorianCalendar value) {
        this.deviceEndDate = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceBillingProfile.
     * 
     * @return
     *     possible object is
     *     {@link DeviceBillingProfileComplexType }
     *     
     */
    public DeviceBillingProfileComplexType getDeviceBillingProfile() {
        return deviceBillingProfile;
    }

    /**
     * Define el valor de la propiedad deviceBillingProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceBillingProfileComplexType }
     *     
     */
    public void setDeviceBillingProfile(DeviceBillingProfileComplexType value) {
        this.deviceBillingProfile = value;
    }

    /**
     * Obtiene el valor de la propiedad oneOffPayments.
     * 
     * @return
     *     possible object is
     *     {@link OneOffPaymentListComplexType }
     *     
     */
    public OneOffPaymentListComplexType getOneOffPayments() {
        return oneOffPayments;
    }

    /**
     * Define el valor de la propiedad oneOffPayments.
     * 
     * @param value
     *     allowed object is
     *     {@link OneOffPaymentListComplexType }
     *     
     */
    public void setOneOffPayments(OneOffPaymentListComplexType value) {
        this.oneOffPayments = value;
    }

    /**
     * Obtiene el valor de la propiedad financingDiscountRate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFinancingDiscountRate() {
        return financingDiscountRate;
    }

    /**
     * Define el valor de la propiedad financingDiscountRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFinancingDiscountRate(BigDecimal value) {
        this.financingDiscountRate = value;
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

    /**
     * Obtiene el valor de la propiedad ssp.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSSP() {
        return ssp;
    }

    /**
     * Define el valor de la propiedad ssp.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSSP(BigDecimal value) {
        this.ssp = value;
    }

    /**
     * Obtiene el valor de la propiedad discountIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountIndicator() {
        return discountIndicator;
    }

    /**
     * Define el valor de la propiedad discountIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountIndicator(String value) {
        this.discountIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceQuantity.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeviceQuantity() {
        return deviceQuantity;
    }

    /**
     * Define el valor de la propiedad deviceQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeviceQuantity(BigInteger value) {
        this.deviceQuantity = value;
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
     * Obtiene el valor de la propiedad firstPlanBillingDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstPlanBillingDate() {
        return firstPlanBillingDate;
    }

    /**
     * Define el valor de la propiedad firstPlanBillingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstPlanBillingDate(XMLGregorianCalendar value) {
        this.firstPlanBillingDate = value;
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
     * Obtiene el valor de la propiedad excludeFromAllocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcludeFromAllocation() {
        return excludeFromAllocation;
    }

    /**
     * Define el valor de la propiedad excludeFromAllocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcludeFromAllocation(String value) {
        this.excludeFromAllocation = value;
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
     * Obtiene el valor de la propiedad billingType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingType() {
        return billingType;
    }

    /**
     * Define el valor de la propiedad billingType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingType(String value) {
        this.billingType = value;
    }

}
