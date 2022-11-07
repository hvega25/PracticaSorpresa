package anotherOne.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import anotherOne.clases.students;


public interface studentsRepository extends JpaRepository<students , Long>{

}
