package com.reto.test.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "producto-app",
                version = "1.0.0",
                description = "Test API para administracion de Productos"
        )
)
public class OpenApiConfig {
}
