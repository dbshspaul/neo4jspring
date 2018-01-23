package com.sys.org.configuration;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;

/**
 * Created by Debasish on 23-Jan-18 8:22 AM
 */
@Configuration
@ComponentScan("com.sys.org")
@EnableNeo4jRepositories("com.sys.org.neo4jrepository")
public class Neo4jConfiguration {

    public static final String URL =
            System.getenv("NEO4J_URL") != null ?
                    System.getenv("NEO4J_URL") : "http://neo4j:test@localhost:7474";

    @Bean
    public SessionFactory getSessionFactory() {
        return new SessionFactory(getConfiguration(), "com.sys.org.nodeEntity");
    }

    @Bean
    public Neo4jTransactionManager transactionManager() throws Exception {
        return new Neo4jTransactionManager(getSessionFactory());
    }

//    @Bean
//    public org.neo4j.ogm.config.Configuration configuration() {
//        org.neo4j.ogm.config.Configuration configuration = new org.neo4j.ogm.config.Configuration();
//        configuration.driverConfiguration().setURI("bolt://localhost:7474");
//        return configuration;
//    }

    @Bean
    public org.neo4j.ogm.config.Configuration getConfiguration() {
        org.neo4j.ogm.config.Configuration config = new org.neo4j.ogm.config.Configuration();
        config.driverConfiguration().setDriverClassName(
                "org.neo4j.ogm.drivers.http.driver.HttpDriver").setURI(URL);
        return config;
    }

}
