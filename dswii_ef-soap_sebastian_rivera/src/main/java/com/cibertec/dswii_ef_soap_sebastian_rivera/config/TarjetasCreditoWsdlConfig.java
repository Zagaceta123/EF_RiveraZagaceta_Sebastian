package com.cibertec.dswii_ef_soap_sebastian_rivera.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class TarjetasCreditoWsdlConfig {
    @Bean(name = "tarjetasCredito")
    public DefaultWsdl11Definition tarjetasCreditoWsdl11Definition(XsdSchema tarjetasCreditoEsquema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("TarjetasCreditoPort");
        wsdl11Definition.setLocationUri("/ws/tarjetasCredito");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(tarjetasCreditoEsquema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema tarjetasCreditoEsquema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/tarjetas.xsd"));
    }
}
