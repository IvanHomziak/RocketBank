package com.ihomziak.ms.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.ihomziak.accounts.controller") })
@EnableJpaRepositories("com.ihomziak.accounts.repository")
@EntityScan("com.ihomziak.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Accounts microservice REST API Documentation",
                description = "RocketBank Accounts microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Ivan Homziak",
                        email = "ihomziak@gmail.com",
                        url = "https://www.ihomziak.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.ihomziak.com"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description =  "RocketBank Accounts microservice REST API Documentation",
                url = "https://www.ihomziak.com/swagger-ui.html"
        )
)
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);
    }

}
