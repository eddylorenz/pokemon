//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.06.02 a las 05:38:26 AM CDT 
//


package com.bancaya.soap.models.id;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jsonResponse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "jsonResponse"
})
@XmlRootElement(name = "IdResponse")
public class IdResponse {

    @XmlElement(required = true)
    protected String jsonResponse;

    /**
     * Obtiene el valor de la propiedad jsonResponse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJsonResponse() {
        return jsonResponse;
    }

    /**
     * Define el valor de la propiedad jsonResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJsonResponse(String value) {
        this.jsonResponse = value;
    }

}
