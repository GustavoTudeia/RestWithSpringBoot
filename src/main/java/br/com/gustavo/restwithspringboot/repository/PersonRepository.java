package br.com.gustavo.restwithspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gustavo.restwithspringboot.data.model.Person;

@Repository
public interface PersonRepository  extends JpaRepository<Person, Long>{

}
