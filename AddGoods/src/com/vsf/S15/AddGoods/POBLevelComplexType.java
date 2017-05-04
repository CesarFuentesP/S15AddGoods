//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.28 a las 01:22:06 PM CEST 
//


package com.vsf.S15.AddGoods;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para POBLevelComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="POBLevelComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceIDDeviceID" type="{http://ifrs.vodafone.com/commonTypes_v3}serviceIDDeviceIDType"/&gt;
 *         &lt;element name="Amounts" type="{http://ifrs15.vodafone.com/events/addgoodsservices_v3}AmountListComplexType" maxOccurs="2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POBLevelComplexType", propOrder = {
    "serviceIDDeviceID",
    "amounts"
})
public class POBLevelComplexType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceIDDeviceID;
    @XmlElement(name = "Amounts", required = true)
    protected List<AmountListComplexType> amounts;

    /**
     * Obtiene el valor de la propiedad serviceIDDeviceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceIDDeviceID() {
        return serviceIDDeviceID;
    }

    /**
     * Define el valor de la propiedad serviceIDDeviceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceIDDeviceID(String value) {
        this.serviceIDDeviceID = value;
    }

    /**
     * Gets the value of the amounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountListComplexType }
     * 
     * 
     */
    public List<AmountListComplexType> getAmounts() {
        if (amounts == null) {
            amounts = new ArrayList<AmountListComplexType>();
        }
        return this.amounts;
    }

}
