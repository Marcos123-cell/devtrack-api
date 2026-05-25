package com.marcos.devtrack.repository;

import com.marcos.devtrack.model.Tecnologia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnologiaRepository extends JpaRepository<Tecnologia, Long> {
}
