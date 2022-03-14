package com.fractal.evaluation.restcontroller;

import com.fractal.evaluation.entity.Product;
import com.fractal.evaluation.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("product")
public class ProductController {

  @Resource
  private ProductRepository ProductRepository;

  @GetMapping
  public Flux<Product> index()
  {
    return ProductRepository.findAll();
  }
  @PostMapping("save")
  public Mono<Product> save(@RequestBody Product Product)
  {
    return ProductRepository.save(Product);
  }
  @PutMapping("edit")
  public Mono<Product> edit(@RequestBody Product Product)
  {
    return ProductRepository.save(Product);
  }
}
