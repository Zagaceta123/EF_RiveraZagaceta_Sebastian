package com.cibertec.dswii_ef_cache_sebastian_rivera;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DswiiEfCacheSebastianRiveraApplication.class);
	}

}
