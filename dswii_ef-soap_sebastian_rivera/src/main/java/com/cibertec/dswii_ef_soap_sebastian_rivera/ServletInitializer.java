package com.cibertec.dswii_ef_soap_sebastian_rivera;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DswiiEfSoapSebastianRiveraApplication.class);
	}

}
