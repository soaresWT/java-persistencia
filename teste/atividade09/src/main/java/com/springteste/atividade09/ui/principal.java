package com.springteste.atividade09.ui;

import java.security.Principal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@SpringBootApplication
@EntityScan("com.springteste.atividade09.entity")
@EnableJpaRepositories("com.springteste.atividade09.dao")
public class principal {

  public static void main(String[] args) {
    SpringApplication.run(Principal.class, args);
    System.out.println("oi");
    SpringApplication.run(CrudAluno.class, args);
  }
}
