package com.fractal.evaluation.restcontroller;

import com.fractal.evaluation.entity.Order;
import com.fractal.evaluation.repository.OrderRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("order")
public class OrderController {

  @Resource
  private OrderRepository orderRepository;

  @GetMapping
  public Flux<Order> index()
  {
    return orderRepository.findAll();
  }
  @PostMapping("save")
  public Mono<Order> save(@RequestBody Order order)
  {
    Optional<Double> total = order.getDetails().stream().map(detail -> detail.getUnitPrice()*detail.getQuantity())
        .reduce(Double::sum);
    order.setTotal(total.orElse(0.0));
    order.setDate(new Date());
    order.setStatus("Pending");
    return orderRepository.save(order);
  }
  @PutMapping("edit")
  public Mono<Order> edit(@RequestBody Order order)
  {
    return orderRepository.save(order);
  }
}
