package com.matheusproencaz.microserviceb.adapters.secondary.scoreCreditoDatabase;

import com.matheusproencaz.microserviceb.application.domain.entity.ScoreCredito;
import com.matheusproencaz.microserviceb.application.port.ScoreCreditoSecondaryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ScoreCreditoAdapter implements ScoreCreditoSecondaryPort {

    private final ScoreCreditoRepository repository;
    private final ScoreCreditoResponseMapper mapper;

    @Override
    public List<ScoreCredito> getScores() {
        return repository.getScoreCreditos().stream()
                .map(mapper::mapResponse)
                .toList();
    }
}
