package com.java.zenyoga.config;

import java.util.List;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class SwaggerConfig {

    // @Value("${zenyoga.swagger.contact.name}")
    private final String name = "DP";

    // @Value("${zenyoga.swagger.contact.email}")
    private final String email = "dp@gmail.com";

    // @Value("${zenyoga.swagger.contact.url}")
    private final String url = "https://example.com";

    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI().info(new Info()
                .title("zenyoga")
                .description("Zenyoga is a streaming service that offers a wide variety of TV shows, movies, documentaries, and original content across a range of genres. Users can stream content on various devices, including smart TVs, smartphones, tablets, and computers.")
                .version("1.0.0")
                .contact(new Contact()
                    .name(name)
                    .email(email)
                    .url(url))
                .license(new License()
                    .name("Apache 2.0")
                    .url("https://www.apache.org/licenses/LICENSE-2.0.html")))
                .servers(List.of(new Server().url("http://localhost:8181")))
                .addSecurityItem(new SecurityRequirement().addList("bearerAuth"))
                .components(new Components()
                    .addSecuritySchemes("bearerAuth", new SecurityScheme()
                                                            .name("Auth")
                                                            .type(SecurityScheme.Type.HTTP)
                                                            .scheme("bearer")
                                                            .description("Provide a json web token.")
                                                            .bearerFormat("JWT")));
    }
}
