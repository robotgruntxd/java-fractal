package com.fractal.evaluation.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Detail {
  @Id String id;
  String consumer;
  Double cost;
  Integer key;
  Integer number;
  String product;
  Integer quantity;
  String status;
  Double unitPrice;

}
