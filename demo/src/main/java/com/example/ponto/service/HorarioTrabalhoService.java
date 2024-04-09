Peço desculpas pela omissão. Aqui está o código completo com os métodos setters incluídos:


        package com.example.ponto.service;

import com.example.ponto.model.HorarioTrabalho;
import com.example.ponto.repository.HorarioTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.List;
import java.util.Optional;

@Service
public class HorarioTrabalhoService {

    @Autowired
    private HorarioTrabalhoRepository repository;

    public HorarioTrabalho salvar(HorarioTrabalho entity) {
        return repository.save(entity);
    }

    public List<HorarioTrabalho> buscaTodos() {
        return repository.findAll();
    }

    public HorarioTrabalho buscaPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
    public long calcularHorasTrabalhadas(Long id) {
        HorarioTrabalho horarioTrabalho = repository.findById(id).orElse(null);
        if (horarioTrabalho != null && horarioTrabalho.getHoraPadraoEntrada() != null && horarioTrabalho.getHoraPadraoSaida() != null) {
            // Calcula a duração entre a hora de entrada e a hora de saída
            Duration duracaoTrabalho = Duration.between(horarioTrabalho.getHoraPadraoEntrada(), horarioTrabalho.getHoraPadraoSaida());

            // Subtrai a duração do intervalo de descanso (1 hora e meia) da duração total de trabalho
            duracaoTrabalho = duracaoTrabalho.minus(Duration.ofMinutes(90));

            // Define o limite padrão de horas por dia
            long limiteHorasPorDia = 8;

            // Verifica se a duração total de trabalho é menor ou igual ao limite de horas por dia
            if (duracaoTrabalho.toHours() <= limiteHorasPorDia) {
                // Se for, retorna a duração total de trabalho em horas
                return duracaoTrabalho.toHours();
            } else {
                // Calcula as horas extras
                long horasExtras = duracaoTrabalho.toHours() - limiteHorasPorDia;

                // Limita as horas extras a um máximo de duas horas
                if (horasExtras > 2) {
                    horasExtras = 2;
                }

                // Retorna as horas extras
                return horasExtras;
            }
        }
        return 0; // Retorna 0 se não houver dados suficientes para calcular as horas trabalhadas
    }

    public HorarioTrabalho alterar(Long id, HorarioTrabalho alterado) {
        Optional<HorarioTrabalho> encontrado = repository.findById(id);
        if (encontrado.isPresent()) {
            HorarioTrabalho horarioTrabalho = encontrado.get();
            horarioTrabalho.setHoraPadraoEntrada(alterado.getHoraPadraoEntrada());
            horarioTrabalho.setHoraPadraoSaida(alterado.getHoraPadraoSaida());
            horarioTrabalho.setHoraPadraoIntervalo(alterado.getHoraPadraoIntervalo());
            horarioTrabalho.setDiasTrabalhados(alterado.getDiasTrabalhados());
            return repository.save(horarioTrabalho);
        }
        return null;
    }

    public void remover(Long id) {repository.deleteById(id);
    }
}


