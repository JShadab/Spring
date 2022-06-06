package com.wipro.SpringWithMongo.config;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	public Docket getDocket() {

		return new Docket(DocumentationType.SWAGGER_2).groupName("Product-API").select()
				.apis(RequestHandlerSelectors.basePackage("com.wipro.SpringWithMongo.controller")).build();
	}

}
