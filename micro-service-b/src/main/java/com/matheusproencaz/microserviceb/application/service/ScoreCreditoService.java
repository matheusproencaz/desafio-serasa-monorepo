package com.matheusproencaz.microserviceb.application.service;

import com.matheusproencaz.microserviceb.application.domain.entity.ScoreCredito;
import com.matheusproencaz.microserviceb.application.port.ScoreCreditoPrimaryPort;
import com.matheusproencaz.microserviceb.application.port.ScoreCreditoSecondaryPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ScoreCreditoService implements ScoreCreditoPrimaryPort {

    private final ScoreCreditoSecondaryPort secondaryPort;

    @Override
    public List<ScoreCredito> getScores() {
        List<ScoreCredito> scores = secondaryPort.getScores();
        log.info("Service: {}",scores);
        return scores;
    }
}
