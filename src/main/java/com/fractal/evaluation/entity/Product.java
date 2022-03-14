package com.fractal.evaluation.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Product {

  @Id
  String id;
  String number;
  String name;
  String category;
  Double price;
  String status;


}
