package br.com.vitormarcato.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vitormarcato.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
