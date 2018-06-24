package com.nemeantalestudios.mythology.config;

import com.mongodb.MongoClient;
import com.nemeantalestudios.mythology.converters.FigureConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;

import java.util.Collections;

@Configuration
public class MongoDBConfig {

    private MongoProperties mongoProperties;
    private MongoClient mongoClient;

    public MongoDBConfig(MongoProperties mongoProperties, MongoClient mongoClient) {
        this.mongoProperties = mongoProperties;
        this.mongoClient = mongoClient;
    }

    @Bean
    public MongoTemplate mongoTemplate() {

        MongoTemplate mongoTemplate = new MongoTemplate(mongoClient, mongoProperties.getDatabase());
        MappingMongoConverter mongoMapping = (MappingMongoConverter) mongoTemplate.getConverter();

        // tell mongodb to use the custom converters
        mongoMapping.setCustomConversions(customConversions());
        mongoMapping.afterPropertiesSet();
        return mongoTemplate;

    }


    public MongoCustomConversions customConversions() {
        return new MongoCustomConversions(Collections.singletonList(new FigureConverter.GenderConverter()));
    }
}
