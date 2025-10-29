package com.jaxrs.demo.repositories;

import com.jaxrs.demo.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}
