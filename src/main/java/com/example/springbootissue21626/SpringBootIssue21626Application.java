package com.example.springbootissue21626;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootIssue21626Application {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootIssue21626Application.class, args);
  }

  // All properties can bind and render to the spring-configuration-metadata.json :)
  @Bean
  @ConfigurationProperties(prefix = "my.base")
  public BaseConfig baseConfig() {
    return new BaseConfig();
  }

  // All properties can bind
  // but cannot render 'nest' property on BaseConfig(parent class) to the spring-configuration-metadata.json :(
  @Bean
  @ConfigurationProperties(prefix = "my.child")
  public ChildConfig childConfig() {
    return new ChildConfig();
  }

  // All properties can bind
  // but cannot render 'nest' property on OverrideChildConfig(override 'nest' property of BaseConfig(parent class))
  // to the spring-configuration-metadata.json :(
  @Bean
  @ConfigurationProperties(prefix = "my.override-child")
  public OverrideChildConfig overrideChildConfig() {
    return new OverrideChildConfig();
  }

}
