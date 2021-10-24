package com.unieco.etl.infra.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class BasicMongoConfig {

    @Value("${spring.data.mongodb.uri}")
    private String uri;

    @Primary
    @Bean(name = "mongoTemplate")
    public MongoTemplate getMongoTemplate() {
        return new MongoTemplate(mongo(), "BoutiquePool");
    }

    @Bean
    public MongoClient mongo() {
        ConnectionString connectionString = new ConnectionString(uri);
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();

        return MongoClients.create(mongoClientSettings);
    }
}