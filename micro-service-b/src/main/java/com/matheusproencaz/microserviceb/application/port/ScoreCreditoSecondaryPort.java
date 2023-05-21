package com.matheusproencaz.microserviceb.application.port;

import com.matheusproencaz.microserviceb.application.domain.entity.ScoreCredito;

import java.util.List;

public interface ScoreCreditoSecondaryPort {

    List<ScoreCredito> getScores();

}
