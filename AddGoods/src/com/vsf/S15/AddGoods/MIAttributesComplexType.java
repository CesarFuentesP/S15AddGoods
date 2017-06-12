//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.06 a las 09:49:38 AM CEST 
//


package com.vsf.S15.AddGoods;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para mIAttributesComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="mIAttributesComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerType" type="{http://ifrs.vodafone.com/commonTypes_v3}customerTypeType" minOccurs="0"/&gt;
 *         &lt;element name="callOriginDestination" type="{http://ifrs.vodafone.com/commonTypes_v3}callOriginDestinationType" minOccurs="0"/&gt;
 *         &lt;element name="channel" type="{http://ifrs.vodafone.com/commonTypes_v3}channelType" minOccurs="0"/&gt;
 *         &lt;element name="segment" type="{http://ifrs.vodafone.com/commonTypes_v3}segmentType" minOccurs="0"/&gt;
 *         &lt;element name="bearerTechnology" type="{http://ifrs.vodafone.com/commonTypes_v3}bearerTechnologyType" minOccurs="0"/&gt;
 *         &lt;element name="valueTier" type="{http://ifrs.vodafone.com/commonTypes_v3}valueTierType" minOccurs="0"/&gt;
 *         &lt;element name="proposition" type="{http://ifrs.vodafone.com/commonTypes_v3}propositionType" minOccurs="0"/&gt;
 *         &lt;element name="deviceTechnology" type="{http://ifrs.vodafone.com/commonTypes_v3}deviceTechnologyType" minOccurs="0"/&gt;
 *         &lt;element name="customer" type="{http://ifrs.vodafone.com/commonTypes_v3}customerType" minOccurs="0"/&gt;
 *         &lt;element name="spare1" type="{http://ifrs.vodafone.com/commonTypes_v3}spare1Type" minOccurs="0"/&gt;
 *         &lt;element name="spare2" type="{http://ifrs.vodafone.com/commonTypes_v3}spare2Type" minOccurs="0"/&gt;
 *         &lt;element name="brand" type="{http://ifrs.vodafone.com/commonTypes_v3}brandType" minOccurs="0"/&gt;
 *         &lt;element name="documentType" type="{http://ifrs.vodafone.com/commonTypes_v3}documentTypeType" minOccurs="0"/&gt;
 *         &lt;element name="tradingPartner" type="{http://ifrs.vodafone.com/commonTypes_v3}tradingPartnerType" minOccurs="0"/&gt;
 *         &lt;element name="batch" type="{http://ifrs.vodafone.com/commonTypes_v3}batchType" minOccurs="0"/&gt;
 *         &lt;element name="valuationType" type="{http://ifrs.vodafone.com/commonTypes_v3}valuationTypeType" minOccurs="0"/&gt;
 *         &lt;element name="functionalArea" type="{http://ifrs.vodafone.com/commonTypes_v3}functionalAreaType" minOccurs="0"/&gt;
 *         &lt;element name="orderNumber" type="{http://ifrs.vodafone.com/commonTypes_v3}orderNumberType" minOccurs="0"/&gt;
 *         &lt;element name="salesOffice" type="{http://ifrs.vodafone.com/commonTypes_v3}salesOfficeType" minOccurs="0"/&gt;
 *         &lt;element name="salesOrg" type="{http://ifrs.vodafone.com/commonTypes_v3}salesOrgType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mIAttributesComplexType", propOrder = {
    "customerType",
    "callOriginDestination",
    "channel",
    "segment",
    "bearerTechnology",
    "valueTier",
    "proposition",
    "deviceTechnology",
    "customer",
    "spare1",
    "spare2",
    "brand",
    "documentType",
    "tradingPartner",
    "batch",
    "valuationType",
    "functionalArea",
    "orderNumber",
    "salesOffice",
    "salesOrg"
})
public class MIAttributesComplexType {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customerType;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String callOriginDestination;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String channel;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String segment;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bearerTechnology;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String valueTier;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String proposition;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deviceTechnology;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customer;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String spare1;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String spare2;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String brand;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String documentType;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tradingPartner;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String batch;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String valuationType;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String functionalArea;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orderNumber;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String salesOffice;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String salesOrg;

    /**
     * Obtiene el valor de la propiedad customerType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Define el valor de la propiedad customerType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * Obtiene el valor de la propiedad callOriginDestination.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallOriginDestination() {
        return callOriginDestination;
    }

    /**
     * Define el valor de la propiedad callOriginDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallOriginDestination(String value) {
        this.callOriginDestination = value;
    }

    /**
     * Obtiene el valor de la propiedad channel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Define el valor de la propiedad channel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * Obtiene el valor de la propiedad segment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment() {
        return segment;
    }

    /**
     * Define el valor de la propiedad segment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment(String value) {
        this.segment = value;
    }

    /**
     * Obtiene el valor de la propiedad bearerTechnology.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBearerTechnology() {
        return bearerTechnology;
    }

    /**
     * Define el valor de la propiedad bearerTechnology.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBearerTechnology(String value) {
        this.bearerTechnology = value;
    }

    /**
     * Obtiene el valor de la propiedad valueTier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueTier() {
        return valueTier;
    }

    /**
     * Define el valor de la propiedad valueTier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueTier(String value) {
        this.valueTier = value;
    }

    /**
     * Obtiene el valor de la propiedad proposition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProposition() {
        return proposition;
    }

    /**
     * Define el valor de la propiedad proposition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProposition(String value) {
        this.proposition = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceTechnology.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceTechnology() {
        return deviceTechnology;
    }

    /**
     * Define el valor de la propiedad deviceTechnology.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceTechnology(String value) {
        this.deviceTechnology = value;
    }

    /**
     * Obtiene el valor de la propiedad customer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * Define el valor de la propiedad customer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer(String value) {
        this.customer = value;
    }

    /**
     * Obtiene el valor de la propiedad spare1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpare1() {
        return spare1;
    }

    /**
     * Define el valor de la propiedad spare1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpare1(String value) {
        this.spare1 = value;
    }

    /**
     * Obtiene el valor de la propiedad spare2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpare2() {
        return spare2;
    }

    /**
     * Define el valor de la propiedad spare2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpare2(String value) {
        this.spare2 = value;
    }

    /**
     * Obtiene el valor de la propiedad brand.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Define el valor de la propiedad brand.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Obtiene el valor de la propiedad documentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Define el valor de la propiedad documentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Obtiene el valor de la propiedad tradingPartner.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradingPartner() {
        return tradingPartner;
    }

    /**
     * Define el valor de la propiedad tradingPartner.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradingPartner(String value) {
        this.tradingPartner = value;
    }

    /**
     * Obtiene el valor de la propiedad batch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatch() {
        return batch;
    }

    /**
     * Define el valor de la propiedad batch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatch(String value) {
        this.batch = value;
    }

    /**
     * Obtiene el valor de la propiedad valuationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuationType() {
        return valuationType;
    }

    /**
     * Define el valor de la propiedad valuationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValuationType(String value) {
        this.valuationType = value;
    }

    /**
     * Obtiene el valor de la propiedad functionalArea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionalArea() {
        return functionalArea;
    }

    /**
     * Define el valor de la propiedad functionalArea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionalArea(String value) {
        this.functionalArea = value;
    }

    /**
     * Obtiene el valor de la propiedad orderNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Define el valor de la propiedad orderNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad salesOffice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOffice() {
        return salesOffice;
    }

    /**
     * Define el valor de la propiedad salesOffice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOffice(String value) {
        this.salesOffice = value;
    }

    /**
     * Obtiene el valor de la propiedad salesOrg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrg() {
        return salesOrg;
    }

    /**
     * Define el valor de la propiedad salesOrg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrg(String value) {
        this.salesOrg = value;
    }

}
