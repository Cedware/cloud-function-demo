package com.example.cloudfunctiondemo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.json.JacksonMapper;
import org.springframework.cloud.function.json.JsonMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class CloudFunctionDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudFunctionDemoApplication.class, args);
    }


    @Bean
    @Primary
    public JsonMapper objectMapper() {
        ObjectMapper om = new ObjectMapper();
        om.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
        return new JacksonMapper(om);
    }
}
