package br.com.imobicontrol.usersproperty.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI usersOpenAPI() {
        return new OpenAPI().info(
                new Info()
                        .title("Gateway API")
                        .description(" My Tenants API")
                        .version("v1.0"));
    }
}
