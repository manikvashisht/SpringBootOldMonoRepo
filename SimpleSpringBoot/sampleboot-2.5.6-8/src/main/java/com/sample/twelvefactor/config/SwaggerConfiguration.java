package com.sample.twelvefactor.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Value("${api.title}")
    private transient String title;

    @Value("${api.description}")
    private transient String description;

    @Value("${api.version}")
    private transient String version;

    @Value("${api.termsOfServiceUrl}")
    private transient String termsOfServiceUrl;

    @Value("${api.contact}")
    private transient String contact;

    @Value("${api.license}")
    private transient String license;

    @Value("${api.licenseUrl}")
    private transient String licenseUrl;
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()// The following block provides general
                // information about the @Api being
                // documented:
                .apiInfo(new ApiInfo(title, // Title
                        description, // Description
                        version, // Version
                        termsOfServiceUrl, // Terms of Service URL
                        new Contact(contact, "", ""), // Contact
                        license, // License
                        licenseUrl,new ArrayList())); // License URL;
    }
}
