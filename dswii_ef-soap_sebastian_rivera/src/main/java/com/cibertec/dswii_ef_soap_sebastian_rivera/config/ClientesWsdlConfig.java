package com.cibertec.dswii_ef_soap_sebastian_rivera.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class ClientesWsdlConfig {
    @Bean(name = "clientes")
    public DefaultWsdl11Definition clientesWsdl11Definition(XsdSchema clientesEsquema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("ClientesPort");
        wsdl11Definition.setLocationUri("/ws/clientes");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(clientesEsquema);
        return wsdl11Definition;
    }
    @Bean
    public XsdSchema clientesEsquema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/clientes.xsd"));
    }
}
