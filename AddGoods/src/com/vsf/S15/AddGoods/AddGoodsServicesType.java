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
 * <p>Clase Java para addGoodsServicesType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="addGoodsServicesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventType" type="{http://ifrs.vodafone.com/commonTypes_v3}eventTypeType"/&gt;
 *         &lt;element name="eventDate" type="{http://ifrs.vodafone.com/commonTypes_v3}eventDateType"/&gt;
 *         &lt;element name="eventContractID" type="{http://ifrs.vodafone.com/commonTypes_v3}eventContractIDType"/&gt;
 *         &lt;element name="companyCode" type="{http://ifrs.vodafone.com/commonTypes_v3}companyCodeType" minOccurs="0"/&gt;
 *         &lt;element name="catchUpIndicator" type="{http://ifrs.vodafone.com/commonTypes_v3}catchUpIndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="billingType" type="{http://ifrs.vodafone.com/commonTypes_v3}billingTypeType" minOccurs="0"/&gt;
 *         &lt;element name="DeviceList" type="{http://ifrs15.vodafone.com/events/addgoodsservices_v3}deviceListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceList" type="{http://ifrs15.vodafone.com/events/addgoodsservices_v3}serviceListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="MIAttributes" type="{http://ifrs15.vodafone.com/events/addgoodsservices_v3}mIAttributesComplexType" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://ifrs.vodafone.com/commonTypes_v3}currencyType"/&gt;
 *         &lt;element name="MaterialRightsList" type="{http://ifrs15.vodafone.com/events/addgoodsservices_v3}materialRightsListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="RebateList" type="{http://ifrs15.vodafone.com/events/addgoodsservices_v3}rebatesListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="FundList" type="{http://ifrs15.vodafone.com/events/addgoodsservices_v3}fundsListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="FeeList" type="{http://ifrs15.vodafone.com/events/addgoodsservices_v3}feeListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="CostList" type="{http://ifrs15.vodafone.com/events/addgoodsservices_v3}CostListComplexType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addGoodsServicesType", propOrder = {
    "eventType",
    "eventDate",
    "eventContractID",
    "companyCode",
    "catchUpIndicator",
    "billingType",
    "deviceList",
    "serviceList",
    "miAttributes",
    "currency",
    "materialRightsList",
    "rebateList",
    "fundList",
    "feeList",
    "costList"
})
public class AddGoodsServicesType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String eventType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String eventContractID;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyCode;
    protected String catchUpIndicator;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String billingType;
    @XmlElement(name = "DeviceList")
    protected DeviceListComplexType deviceList;
    @XmlElement(name = "ServiceList")
    protected ServiceListComplexType serviceList;
    @XmlElement(name = "MIAttributes")
    protected MIAttributesComplexType miAttributes;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CurrencyType currency;
    @XmlElement(name = "MaterialRightsList")
    protected MaterialRightsListComplexType materialRightsList;
    @XmlElement(name = "RebateList")
    protected RebatesListComplexType rebateList;
    @XmlElement(name = "FundList")
    protected FundsListComplexType fundList;
    @XmlElement(name = "FeeList")
    protected FeeListComplexType feeList;
    @XmlElement(name = "CostList")
    protected CostListComplexType costList;

    /**
     * Obtiene el valor de la propiedad eventType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Define el valor de la propiedad eventType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Obtiene el valor de la propiedad eventDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Define el valor de la propiedad eventDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

    /**
     * Obtiene el valor de la propiedad eventContractID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventContractID() {
        return eventContractID;
    }

    /**
     * Define el valor de la propiedad eventContractID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventContractID(String value) {
        this.eventContractID = value;
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
     * Obtiene el valor de la propiedad catchUpIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatchUpIndicator() {
        return catchUpIndicator;
    }

    /**
     * Define el valor de la propiedad catchUpIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatchUpIndicator(String value) {
        this.catchUpIndicator = value;
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
     * Obtiene el valor de la propiedad deviceList.
     * 
     * @return
     *     possible object is
     *     {@link DeviceListComplexType }
     *     
     */
    public DeviceListComplexType getDeviceList() {
        return deviceList;
    }

    /**
     * Define el valor de la propiedad deviceList.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceListComplexType }
     *     
     */
    public void setDeviceList(DeviceListComplexType value) {
        this.deviceList = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceList.
     * 
     * @return
     *     possible object is
     *     {@link ServiceListComplexType }
     *     
     */
    public ServiceListComplexType getServiceList() {
        return serviceList;
    }

    /**
     * Define el valor de la propiedad serviceList.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceListComplexType }
     *     
     */
    public void setServiceList(ServiceListComplexType value) {
        this.serviceList = value;
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
     * Obtiene el valor de la propiedad currency.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getCurrency() {
        return currency;
    }

    /**
     * Define el valor de la propiedad currency.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setCurrency(CurrencyType value) {
        this.currency = value;
    }

    /**
     * Obtiene el valor de la propiedad materialRightsList.
     * 
     * @return
     *     possible object is
     *     {@link MaterialRightsListComplexType }
     *     
     */
    public MaterialRightsListComplexType getMaterialRightsList() {
        return materialRightsList;
    }

    /**
     * Define el valor de la propiedad materialRightsList.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialRightsListComplexType }
     *     
     */
    public void setMaterialRightsList(MaterialRightsListComplexType value) {
        this.materialRightsList = value;
    }

    /**
     * Obtiene el valor de la propiedad rebateList.
     * 
     * @return
     *     possible object is
     *     {@link RebatesListComplexType }
     *     
     */
    public RebatesListComplexType getRebateList() {
        return rebateList;
    }

    /**
     * Define el valor de la propiedad rebateList.
     * 
     * @param value
     *     allowed object is
     *     {@link RebatesListComplexType }
     *     
     */
    public void setRebateList(RebatesListComplexType value) {
        this.rebateList = value;
    }

    /**
     * Obtiene el valor de la propiedad fundList.
     * 
     * @return
     *     possible object is
     *     {@link FundsListComplexType }
     *     
     */
    public FundsListComplexType getFundList() {
        return fundList;
    }

    /**
     * Define el valor de la propiedad fundList.
     * 
     * @param value
     *     allowed object is
     *     {@link FundsListComplexType }
     *     
     */
    public void setFundList(FundsListComplexType value) {
        this.fundList = value;
    }

    /**
     * Obtiene el valor de la propiedad feeList.
     * 
     * @return
     *     possible object is
     *     {@link FeeListComplexType }
     *     
     */
    public FeeListComplexType getFeeList() {
        return feeList;
    }

    /**
     * Define el valor de la propiedad feeList.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeListComplexType }
     *     
     */
    public void setFeeList(FeeListComplexType value) {
        this.feeList = value;
    }

    /**
     * Obtiene el valor de la propiedad costList.
     * 
     * @return
     *     possible object is
     *     {@link CostListComplexType }
     *     
     */
    public CostListComplexType getCostList() {
        return costList;
    }

    /**
     * Define el valor de la propiedad costList.
     * 
     * @param value
     *     allowed object is
     *     {@link CostListComplexType }
     *     
     */
    public void setCostList(CostListComplexType value) {
        this.costList = value;
    }

}
