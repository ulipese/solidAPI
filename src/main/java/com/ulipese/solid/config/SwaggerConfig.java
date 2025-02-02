package com.ulipese.solid.config;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Solid Api",
                version = "1.0",
                description = "A RESTful api created to apply basic SOLID concepts",
                contact = @io.swagger.v3.oas.annotations.info.Contact(
                        name = "Felipe Sousa de Oliveira",
                        email = "felipe.sousa4030@gmail.com"
                ),
                license = @io.swagger.v3.oas.annotations.info.License(
                        name = "Apache 2.0",
                        url = "https://www.apache.org/licenses/LICENSE-2.0"
                )
        )
)
public class SwaggerConfig {
}