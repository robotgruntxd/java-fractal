package com.fractal.evaluation;

import com.fractal.evaluation.repository.OrderRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication

public class EvaluationApplication {

  public static void main(String[] args) {
    SpringApplication.run(EvaluationApplication.class, args);
  }

}
