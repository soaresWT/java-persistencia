package com.trabalho02.trabalho2.UI;

import com.trabalho02.trabalho2.Controller.Crud;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.trabalho02.trabalho2.entity")
@EnableJpaRepositories("com.trabalho02.trabalho2.DAO")
@ComponentScan("com.trabalho02.trabalho2")
@SpringBootApplication
public class Main {

  public static void main(String[] args) {
    SpringApplicationBuilder builder = new SpringApplicationBuilder(Crud.class);
    builder.headless(false).run(args);
  }
}
