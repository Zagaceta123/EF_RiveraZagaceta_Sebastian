package com.cibertec.dswii_ef_soap_sebastian_rivera.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class PrestamosWsdlConfig {
    @Bean(name = "prestamos")
    public DefaultWsdl11Definition prestamosWsdl11Definition(XsdSchema prestamosEsquema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("PrestamosPort");
        wsdl11Definition.setLocationUri("/ws/prestamos");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(prestamosEsquema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema prestamosEsquema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/prestamos.xsd"));
    }
}
