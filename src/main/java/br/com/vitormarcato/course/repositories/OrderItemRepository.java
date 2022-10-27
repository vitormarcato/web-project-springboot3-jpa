package br.com.vitormarcato.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vitormarcato.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
