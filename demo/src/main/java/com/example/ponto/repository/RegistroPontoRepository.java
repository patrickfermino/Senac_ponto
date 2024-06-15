package com.example.ponto.repository;

import com.example.ponto.models.domain.RegistroPonto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroPontoRepository extends JpaRepository<RegistroPonto, Long> {
}
