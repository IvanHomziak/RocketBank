package com.ihomziak.ms.cards;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.ihomziak.cards.controller") })
@EnableJpaRepositories("com.ihomziak.cards.repository")
@EntityScan("com.ihomziak.cards.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Cards microservice REST API Documentation",
                description = "RocketBank Cards microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Madan Reddy",
                        email = "tutor@gmail.com",
                        url = "https://www.ihomziak.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.ihomziak.com"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "RocketBank Cards microservice REST API Documentation",
                url = "https://www.ihomziak.com/swagger-ui.html"
        )
)
public class CardsApplication {

    static void main(String[] args) {
        SpringApplication.run(CardsApplication.class, args);
    }
}
