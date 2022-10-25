package br.com.vitormarcato.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vitormarcato.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
