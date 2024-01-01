/**
 * 
 */
package br.com.kezia.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@EnableMongoRepositories(basePackages = "br.com.kezia.repository")
public class MongoConfig {

}
