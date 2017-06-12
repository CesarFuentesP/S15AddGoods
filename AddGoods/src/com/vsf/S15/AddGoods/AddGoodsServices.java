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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Header" type="{http://ifrs.vodafone.com/commonTypes_v3}fileHeaderComplexType"/&gt;
 *         &lt;element name="Data" type="{http://ifrs15.vodafone.com/events/addgoodsservices_v3}addGoodsServicesComplexType"/&gt;
 *         &lt;element name="Footer" type="{http://ifrs.vodafone.com/commonTypes_v3}fileFooterComplexType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "data",
    "footer"
})
@XmlRootElement(name = "AddGoodsServices")
public class AddGoodsServices {

    @XmlElement(name = "Header", required = true)
    protected FileHeaderComplexType header;
    @XmlElement(name = "Data", required = true)
    protected AddGoodsServicesComplexType data;
    @XmlElement(name = "Footer", required = true)
    protected FileFooterComplexType footer;

    /**
     * Obtiene el valor de la propiedad header.
     * 
     * @return
     *     possible object is
     *     {@link FileHeaderComplexType }
     *     
     */
    public FileHeaderComplexType getHeader() {
        return header;
    }

    /**
     * Define el valor de la propiedad header.
     * 
     * @param value
     *     allowed object is
     *     {@link FileHeaderComplexType }
     *     
     */
    public void setHeader(FileHeaderComplexType value) {
        this.header = value;
    }

    /**
     * Obtiene el valor de la propiedad data.
     * 
     * @return
     *     possible object is
     *     {@link AddGoodsServicesComplexType }
     *     
     */
    public AddGoodsServicesComplexType getData() {
        return data;
    }

    /**
     * Define el valor de la propiedad data.
     * 
     * @param value
     *     allowed object is
     *     {@link AddGoodsServicesComplexType }
     *     
     */
    public void setData(AddGoodsServicesComplexType value) {
        this.data = value;
    }

    /**
     * Obtiene el valor de la propiedad footer.
     * 
     * @return
     *     possible object is
     *     {@link FileFooterComplexType }
     *     
     */
    public FileFooterComplexType getFooter() {
        return footer;
    }

    /**
     * Define el valor de la propiedad footer.
     * 
     * @param value
     *     allowed object is
     *     {@link FileFooterComplexType }
     *     
     */
    public void setFooter(FileFooterComplexType value) {
        this.footer = value;
    }

}
