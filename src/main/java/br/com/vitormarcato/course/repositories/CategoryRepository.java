package br.com.vitormarcato.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vitormarcato.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
