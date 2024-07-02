package com.example.ponto.repository;

import com.example.ponto.enterprise.CustomQuerydslPredicateExecutor;
import com.example.ponto.models.domain.RegistroPonto;
import com.example.ponto.models.domain.Relatorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelatorioRepository extends JpaRepository<Relatorio, Long>, CustomQuerydslPredicateExecutor<Relatorio> {

}
