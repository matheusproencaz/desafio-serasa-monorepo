package com.matheusproencaz.microserviceb.adapters.primary.controller;

import com.matheusproencaz.microserviceb.adapters.primary.ScoreCreditoMapper;
import com.matheusproencaz.microserviceb.adapters.primary.dto.ScoreCreditoDTO;
import com.matheusproencaz.microserviceb.application.port.ScoreCreditoPrimaryPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ProduceController {

    private final KafkaTemplate<String, Serializable> kafkaTemplate;

    private final ScoreCreditoPrimaryPort scorePort;

    private final ScoreCreditoMapper mapper;

    @GetMapping("send-score")
    public void sendScoreCredito() {
        List<ScoreCreditoDTO> scores = scorePort.getScores()
                .stream()
                .map(mapper::mapResponse)
                .toList();

        log.info("Scores: {}",scores);

        scores.forEach(score -> kafkaTemplate.send(
                "score-credito-topic",
                score)
        );
    }
}
