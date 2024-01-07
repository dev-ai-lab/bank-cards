/**
 * 
 */
package com.bank.cards.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

/**
 * @author Bank
 *
 */
@Configuration
@ConfigurationProperties(prefix = "cards")
@Getter @Setter @ToString
public class CardsServiceConfig {

	 private String msg;
	 private String buildVersion;
	 private Map<String, String> mailDetails;
	 private List<String> activeBranches;

}
