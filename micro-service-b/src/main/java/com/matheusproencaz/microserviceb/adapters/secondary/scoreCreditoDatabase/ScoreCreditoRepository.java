package com.matheusproencaz.microserviceb.adapters.secondary.scoreCreditoDatabase;

import com.matheusproencaz.microserviceb.adapters.secondary.scoreCreditoDatabase.dto.ScoreCreditoResponseDatabase;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.*;

@Repository
public class ScoreCreditoRepository {

    List<ScoreCreditoResponseDatabase> database = new ArrayList<>();

    public ScoreCreditoRepository() {
        databaseInit();
    }

    public List<ScoreCreditoResponseDatabase> getScoreCreditos() {
        return database;
    }

    public void databaseInit() {
        ScoreCreditoResponseDatabase score1 =
                ScoreCreditoResponseDatabase.builder()
                        .idade(20)
                        .fontesDeRenda(Arrays.asList("Trabalho 1", "Renda Fixa 1", "Renda Fixa 2", "Ação 1"))
                        .enderecos(Arrays.asList(ScoreCreditoResponseDatabase.EnderecoResponse.builder()
                                .logradouro("Rua dos Bobos")
                                .numero(10)
                                .build()))
                        .listaBens(Arrays.asList(ScoreCreditoResponseDatabase.BensResponse.builder()
                                .tipoDeBem("Carro")
                                .valorDoBem(BigDecimal.valueOf(10000))
                                .build()))
                        .build();

        ScoreCreditoResponseDatabase score2 =
                ScoreCreditoResponseDatabase.builder()
                        .idade(25)
                        .fontesDeRenda(Arrays.asList("Trabalho 1", "Renda Fixa 1", "Renda Fixa 2", "Ação 1"))
                        .enderecos(Arrays.asList(ScoreCreditoResponseDatabase.EnderecoResponse.builder()
                                .logradouro("Rua dos Bobos")
                                .numero(10)
                                .build()))
                        .listaBens(Arrays.asList(ScoreCreditoResponseDatabase.BensResponse.builder()
                                .tipoDeBem("Carro")
                                .valorDoBem(BigDecimal.valueOf(100000))
                                .build()))
                        .build();
        database.add(0, score1);
        database.add(0, score2);
    }
}
