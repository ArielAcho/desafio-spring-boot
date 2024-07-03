package ar.com.challenge.desafio_spring_boot.repository;

import ar.com.challenge.desafio_spring_boot.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolRepository extends JpaRepository<Rol, Integer> {

    Optional<Rol> findByName(String name);
}
