package com.example.ponto.service;

import com.example.ponto.models.domain.HorarioTrabalho;
import com.example.ponto.repository.HorarioTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Duration;
import java.util.List;
import java.util.Optional;

@Service
public class HorarioTrabalhoService {

    private final HorarioTrabalhoRepository repository;

    @Autowired
    public HorarioTrabalhoService(HorarioTrabalhoRepository repository) {
        this.repository = repository;
    }

    public HorarioTrabalho salvar(HorarioTrabalho entity) {
        return repository.save(entity);
    }

    public List<HorarioTrabalho> buscaTodos() {
        return repository.findAll();
    }

    public Optional<HorarioTrabalho> buscaPorId(Long id) {
        return repository.findById(id);
    }
    public long calcularHorasTrabalhadas(Long id) {
        HorarioTrabalho horarioTrabalho = repository.findById(id).orElse(null);
        if (horarioTrabalho != null && horarioTrabalho.getHoraEntrada() != null && horarioTrabalho.getHoraSaida() != null) {
            // Calcula a duração entre a hora de entrada e a hora de saída
            Duration duracaoTrabalho = Duration.between(horarioTrabalho.getHoraEntrada(), horarioTrabalho.getHoraSaida());

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

    @Transactional
    public HorarioTrabalho alterar(Long id, HorarioTrabalho alterado) {
        return repository.findById(id)
                .map(horarioTrabalho -> {
                    horarioTrabalho.setHoraEntrada(alterado.getHoraEntrada());
                    horarioTrabalho.setHoraSaida(alterado.getHoraSaida());
                    horarioTrabalho.setHoraIntervalo(alterado.getHoraIntervalo());
                    horarioTrabalho.setDiasTrabalhados(alterado.getDiasTrabalhados());
                    return repository.save(horarioTrabalho);
                })
                .orElseThrow(() -> new RuntimeException("Horário de trabalho não encontrado"));
    }

    public void remover(Long id) {
        repository.deleteById(id);
    }
}



