package com.bank.cards;

import com.bank.cards.dto.CardsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/* Used when used kubernetes discovery server */
@EnableDiscoveryClient
/*@ComponentScans({ @ComponentScan("com.bank.cards.web") })
@EnableJpaRepositories("com.bank.cards.repository")
@EntityScan("com.bank.cards.entity")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {CardsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "Bank Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Enayetullah Rasuli",
						email = "info@bank.com",
						url = "https://www.devailab.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.devailab.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "Bank Accounts microservice REST API Documentation",
				url = "https://www.devailab.com/swagger-ui.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}
}
