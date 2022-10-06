package br.com.vitormarcato.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vitormarcato.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
