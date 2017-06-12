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


/**
 * <p>Clase Java para oneOffPaymentComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="oneOffPaymentComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="oneOffPaymentType" type="{http://ifrs.vodafone.com/commonTypes_v3}oneOffPaymentTypeType" minOccurs="0"/&gt;
 *         &lt;element name="oneOffPaymentAmount" type="{http://ifrs.vodafone.com/commonTypes_v3}oneOffPaymentAmountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oneOffPaymentComplexType", propOrder = {
    "oneOffPaymentType",
    "oneOffPaymentAmount"
})
public class OneOffPaymentComplexType {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String oneOffPaymentType;
    @XmlElement(required = true)
    protected BigDecimal oneOffPaymentAmount;

    /**
     * Obtiene el valor de la propiedad oneOffPaymentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneOffPaymentType() {
        return oneOffPaymentType;
    }

    /**
     * Define el valor de la propiedad oneOffPaymentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneOffPaymentType(String value) {
        this.oneOffPaymentType = value;
    }

    /**
     * Obtiene el valor de la propiedad oneOffPaymentAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOneOffPaymentAmount() {
        return oneOffPaymentAmount;
    }

    /**
     * Define el valor de la propiedad oneOffPaymentAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOneOffPaymentAmount(BigDecimal value) {
        this.oneOffPaymentAmount = value;
    }

}
