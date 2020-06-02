//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.06.02 a las 05:38:26 AM CDT 
//


package com.bancaya.soap.models.name;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bancaya.soap.models.name package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bancaya.soap.models.name
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NameResponse }
     * 
     */
    public NameResponse createNameResponse() {
        return new NameResponse();
    }

    /**
     * Create an instance of {@link NameRequest }
     * 
     */
    public NameRequest createNameRequest() {
        return new NameRequest();
    }

}
