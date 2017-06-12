//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.06 a las 09:49:38 AM CEST 
//


package com.vsf.S15.AddGoods;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para addGoodsServicesComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="addGoodsServicesComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddGoodsServices" type="{http://ifrs15.vodafone.com/events/addgoodsservices_v3}addGoodsServicesType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addGoodsServicesComplexType", propOrder = {
    "addGoodsServices"
})
public class AddGoodsServicesComplexType {

    @XmlElement(name = "AddGoodsServices", required = true)
    protected List<AddGoodsServicesType> addGoodsServices;

    /**
     * Gets the value of the addGoodsServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addGoodsServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddGoodsServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddGoodsServicesType }
     * 
     * 
     */
    public List<AddGoodsServicesType> getAddGoodsServices() {
        if (addGoodsServices == null) {
            addGoodsServices = new ArrayList<AddGoodsServicesType>();
        }
        return this.addGoodsServices;
    }

}
