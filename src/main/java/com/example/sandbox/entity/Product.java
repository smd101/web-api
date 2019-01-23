package com.example.sandbox.entity;

import java.math.BigDecimal;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "prd_product")
public class Product {
  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private BigDecimal price;
}