package com.handmadecode.amam.config;

import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Profile(value = "mongo")//db 알려줌
@Configuration //환경설정 임을 알려줌
@Import(EmbeddedMongoAutoConfiguration.class)//default configuration import
public class MongodbConfig {

}
