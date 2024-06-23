package com.example.ponto.repository;

import com.example.ponto.models.domain.RegistroPonto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ponto.enterprise.CustomQuerydslPredicateExecutor;

@Repository
public interface RegistroPontoRepository extends JpaRepository<RegistroPonto, Long>, CustomQuerydslPredicateExecutor<RegistroPonto> {
}
