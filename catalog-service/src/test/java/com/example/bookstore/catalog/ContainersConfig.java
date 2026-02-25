package com.example.bookstore.catalog;

import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class ContainersConfig {

    //    @Bean
    //    @ServiceConnection
    //    MySQLContainer<?> mysqlContainer() {
    //        return new MySQLContainer<>(
    //                DockerImageName.parse("mysql:8.0"))
    //                .withDatabaseName("testdb")
    //                .withUsername("test")
    //                .withPassword("test");
    //    }
}
