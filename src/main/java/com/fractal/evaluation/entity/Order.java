package com.fractal.evaluation.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
@Data
public class Order {


  @Id
  String id;
  Integer number;
  String consumer;
  String status;
  Date date;
  Double total;
   List<Detail> details;

}
