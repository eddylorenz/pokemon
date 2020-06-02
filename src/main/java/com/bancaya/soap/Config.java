package com.bancaya.soap;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class Config extends WsConfigurerAdapter
{
    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext)
    {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/service/*");
    }

    @Bean(name = "abilitiesWsdl")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema abilitySchema)
    {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("abilitiesPort");
        wsdl11Definition.setLocationUri("/service/abilities");
        wsdl11Definition.setTargetNamespace("com/bancaya/soap/models/abilities");
        wsdl11Definition.setSchema(abilitySchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema abilitySchema()
    {
        return new SimpleXsdSchema(new ClassPathResource("ability.xsd"));
    }


    @Bean(name = "experienceWsdl")
    public DefaultWsdl11Definition defaultWsdl11DefinitionExperience(XsdSchema experienceSchema)
    {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("experiencePort");
        wsdl11Definition.setLocationUri("/service/experience");
        wsdl11Definition.setTargetNamespace("com/bancaya/soap/models/experience");
        wsdl11Definition.setSchema(experienceSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema experienceSchema()
    {
        return new SimpleXsdSchema(new ClassPathResource("experience.xsd"));
    }


    @Bean(name = "heldWsdl")
    public DefaultWsdl11Definition defaultWsdl11DefinitionHeld(XsdSchema heldSchema)
    {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("heldPort");
        wsdl11Definition.setLocationUri("/service/held");
        wsdl11Definition.setTargetNamespace("com/bancaya/soap/models/held");
        wsdl11Definition.setSchema(heldSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema heldSchema()
    {
        return new SimpleXsdSchema(new ClassPathResource("held.xsd"));
    }


    @Bean(name = "idWsdl")
    public DefaultWsdl11Definition defaultWsdl11DefinitionId(XsdSchema idSchema)
    {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("idPort");
        wsdl11Definition.setLocationUri("/service/id");
        wsdl11Definition.setTargetNamespace("com/bancaya/soap/models/id");
        wsdl11Definition.setSchema(idSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema idSchema()
    {
        return new SimpleXsdSchema(new ClassPathResource("id.xsd"));
    }


    @Bean(name = "nameWsdl")
    public DefaultWsdl11Definition defaultWsdl11DefinitionName(XsdSchema nameSchema)
    {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("namePort");
        wsdl11Definition.setLocationUri("/service/name");
        wsdl11Definition.setTargetNamespace("com/bancaya/soap/models/name");
        wsdl11Definition.setSchema(nameSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema nameSchema()
    {
        return new SimpleXsdSchema(new ClassPathResource("name.xsd"));
    }


    @Bean(name = "locationWsdl")
    public DefaultWsdl11Definition defaultWsdl11DefinitionLocation(XsdSchema locationSchema)
    {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("locationPort");
        wsdl11Definition.setLocationUri("/service/location");
        wsdl11Definition.setTargetNamespace("com/bancaya/soap/models/location");
        wsdl11Definition.setSchema(locationSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema locationSchema()
    {
        return new SimpleXsdSchema(new ClassPathResource("location.xsd"));
    }

}