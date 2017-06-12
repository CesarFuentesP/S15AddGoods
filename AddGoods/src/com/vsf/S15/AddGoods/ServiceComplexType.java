//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.06 a las 09:49:38 AM CEST 
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
 * <p>Clase Java para serviceComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="serviceComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceCode" type="{http://ifrs.vodafone.com/commonTypes_v3}serviceCodeType"/&gt;
 *         &lt;element name="serviceID" type="{http://ifrs.vodafone.com/commonTypes_v3}serviceIDType"/&gt;
 *         &lt;element name="serviceTimeUnit" type="{http://ifrs.vodafone.com/commonTypes_v3}serviceTimeUnitType" minOccurs="0"/&gt;
 *         &lt;element name="activatedServices" type="{http://ifrs.vodafone.com/commonTypes_v3}activatedServicesType" minOccurs="0"/&gt;
 *         &lt;element name="serviceTransferDate" type="{http://ifrs.vodafone.com/commonTypes_v3}serviceTransferDateType" minOccurs="0"/&gt;
 *         &lt;element name="serviceStartDate" type="{http://ifrs.vodafone.com/commonTypes_v3}serviceDateType"/&gt;
 *         &lt;element name="serviceEndDate" type="{http://ifrs.vodafone.com/commonTypes_v3}serviceDateType"/&gt;
 *         &lt;element name="ServiceBillingProfile" type="{http://ifrs15.vodafone.com/events/addgoodsservices_v3}serviceBillingProfileComplexType"/&gt;
 *         &lt;element name="sSP" type="{http://ifrs.vodafone.com/commonTypes_v3}sSPType"/&gt;
 *         &lt;element name="OneOffPayments" type="{http://ifrs15.vodafone.com/events/addgoodsservices_v3}oneOffPaymentListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="serviceEndDateEstimated" type="{http://ifrs.vodafone.com/commonTypes_v3}serviceEndDateEstimatedType" minOccurs="0"/&gt;
 *         &lt;element name="lMSpecificMiDimensions" type="{http://ifrs.vodafone.com/commonTypes_v3}lMSpecificMiDimensionsType" minOccurs="0"/&gt;
 *         &lt;element name="MIAttributes" type="{http://ifrs15.vodafone.com/events/addgoodsservices_v3}mIAttributesComplexType" minOccurs="0"/&gt;
 *         &lt;element name="maxRolloverPeriod" type="{http://ifrs.vodafone.com/commonTypes_v3}maxRolloverPeriodType" minOccurs="0"/&gt;
 *         &lt;element name="discountIndicator" type="{http://ifrs.vodafone.com/commonTypes_v3}discountIndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="inbundleAllowanceValue" type="{http://ifrs.vodafone.com/commonTypes_v3}inbundleAllowanceValueType" minOccurs="0"/&gt;
 *         &lt;element name="inbundleAllowanceType" type="{http://ifrs.vodafone.com/commonTypes_v3}inbundleAllowanceTypeType" minOccurs="0"/&gt;
 *         &lt;element name="serviceQuantity" type="{http://ifrs.vodafone.com/commonTypes_v3}serviceQuantityType"/&gt;
 *         &lt;element name="companyCode" type="{http://ifrs.vodafone.com/commonTypes_v3}companyCodeType" minOccurs="0"/&gt;
 *         &lt;element name="firstPlanBillingDate" type="{http://ifrs.vodafone.com/commonTypes_v3}firstPlanBillingDateType" minOccurs="0"/&gt;
 *         &lt;element name="profitCenter" type="{http://ifrs.vodafone.com/commonTypes_v3}profitCenterType"/&gt;
 *         &lt;element name="excludeFromAllocation" type="{http://ifrs.vodafone.com/commonTypes_v3}excludeFromAllocationType" minOccurs="0"/&gt;
 *         &lt;element name="referenceAccount" type="{http://ifrs.vodafone.com/commonTypes_v3}referenceAccountType" minOccurs="0"/&gt;
 *         &lt;element name="pOBName" type="{http://ifrs.vodafone.com/commonTypes_v3}pOBNameType" minOccurs="0"/&gt;
 *         &lt;element name="billingType" type="{http://ifrs.vodafone.com/commonTypes_v3}billingTypeType" minOccurs="0"/&gt;
 *         &lt;element name="indirectChannelTariffEqualisationFactor" type="{http://ifrs.vodafone.com/commonTypes_v3}indirectChannelTariffEqualisationFactorType" minOccurs="0"/&gt;
 *         &lt;element name="serviceType" type="{http://ifrs.vodafone.com/commonTypes_v3}serviceTypeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceComplexType", propOrder = {
    "serviceCode",
    "serviceID",
    "serviceTimeUnit",
    "activatedServices",
    "serviceTransferDate",
    "serviceStartDate",
    "serviceEndDate",
    "serviceBillingProfile",
    "ssp",
    "oneOffPayments",
    "serviceEndDateEstimated",
    "lmSpecificMiDimensions",
    "miAttributes",
    "maxRolloverPeriod",
    "discountIndicator",
    "inbundleAllowanceValue",
    "inbundleAllowanceType",
    "serviceQuantity",
    "companyCode",
    "firstPlanBillingDate",
    "profitCenter",
    "excludeFromAllocation",
    "referenceAccount",
    "pobName",
    "billingType",
    "indirectChannelTariffEqualisationFactor",
    "serviceType"
})
public class ServiceComplexType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceCode;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceID;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceTimeUnit;
    protected BigInteger activatedServices;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar serviceTransferDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar serviceStartDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar serviceEndDate;
    @XmlElement(name = "ServiceBillingProfile", required = true)
    protected ServiceBillingProfileComplexType serviceBillingProfile;
    @XmlElement(name = "sSP", required = true)
    protected BigDecimal ssp;
    @XmlElement(name = "OneOffPayments")
    protected OneOffPaymentListComplexType oneOffPayments;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar serviceEndDateEstimated;
    @XmlElement(name = "lMSpecificMiDimensions")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lmSpecificMiDimensions;
    @XmlElement(name = "MIAttributes")
    protected MIAttributesComplexType miAttributes;
    protected BigInteger maxRolloverPeriod;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String discountIndicator;
    protected BigDecimal inbundleAllowanceValue;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String inbundleAllowanceType;
    @XmlElement(required = true)
    protected BigInteger serviceQuantity;
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
    protected BigDecimal indirectChannelTariffEqualisationFactor;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceType;

    /**
     * Obtiene el valor de la propiedad serviceCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Define el valor de la propiedad serviceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceID() {
        return serviceID;
    }

    /**
     * Define el valor de la propiedad serviceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceID(String value) {
        this.serviceID = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceTimeUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceTimeUnit() {
        return serviceTimeUnit;
    }

    /**
     * Define el valor de la propiedad serviceTimeUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceTimeUnit(String value) {
        this.serviceTimeUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad activatedServices.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getActivatedServices() {
        return activatedServices;
    }

    /**
     * Define el valor de la propiedad activatedServices.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setActivatedServices(BigInteger value) {
        this.activatedServices = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceTransferDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceTransferDate() {
        return serviceTransferDate;
    }

    /**
     * Define el valor de la propiedad serviceTransferDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceTransferDate(XMLGregorianCalendar value) {
        this.serviceTransferDate = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceStartDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceStartDate() {
        return serviceStartDate;
    }

    /**
     * Define el valor de la propiedad serviceStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceStartDate(XMLGregorianCalendar value) {
        this.serviceStartDate = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceEndDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceEndDate() {
        return serviceEndDate;
    }

    /**
     * Define el valor de la propiedad serviceEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceEndDate(XMLGregorianCalendar value) {
        this.serviceEndDate = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceBillingProfile.
     * 
     * @return
     *     possible object is
     *     {@link ServiceBillingProfileComplexType }
     *     
     */
    public ServiceBillingProfileComplexType getServiceBillingProfile() {
        return serviceBillingProfile;
    }

    /**
     * Define el valor de la propiedad serviceBillingProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBillingProfileComplexType }
     *     
     */
    public void setServiceBillingProfile(ServiceBillingProfileComplexType value) {
        this.serviceBillingProfile = value;
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
     * Obtiene el valor de la propiedad serviceEndDateEstimated.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceEndDateEstimated() {
        return serviceEndDateEstimated;
    }

    /**
     * Define el valor de la propiedad serviceEndDateEstimated.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceEndDateEstimated(XMLGregorianCalendar value) {
        this.serviceEndDateEstimated = value;
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
     * Obtiene el valor de la propiedad maxRolloverPeriod.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxRolloverPeriod() {
        return maxRolloverPeriod;
    }

    /**
     * Define el valor de la propiedad maxRolloverPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxRolloverPeriod(BigInteger value) {
        this.maxRolloverPeriod = value;
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
     * Obtiene el valor de la propiedad inbundleAllowanceValue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInbundleAllowanceValue() {
        return inbundleAllowanceValue;
    }

    /**
     * Define el valor de la propiedad inbundleAllowanceValue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInbundleAllowanceValue(BigDecimal value) {
        this.inbundleAllowanceValue = value;
    }

    /**
     * Obtiene el valor de la propiedad inbundleAllowanceType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInbundleAllowanceType() {
        return inbundleAllowanceType;
    }

    /**
     * Define el valor de la propiedad inbundleAllowanceType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInbundleAllowanceType(String value) {
        this.inbundleAllowanceType = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceQuantity.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getServiceQuantity() {
        return serviceQuantity;
    }

    /**
     * Define el valor de la propiedad serviceQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setServiceQuantity(BigInteger value) {
        this.serviceQuantity = value;
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

    /**
     * Obtiene el valor de la propiedad indirectChannelTariffEqualisationFactor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndirectChannelTariffEqualisationFactor() {
        return indirectChannelTariffEqualisationFactor;
    }

    /**
     * Define el valor de la propiedad indirectChannelTariffEqualisationFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndirectChannelTariffEqualisationFactor(BigDecimal value) {
        this.indirectChannelTariffEqualisationFactor = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Define el valor de la propiedad serviceType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

}
