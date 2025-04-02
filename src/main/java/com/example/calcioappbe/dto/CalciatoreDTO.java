package com.example.calcioappbe.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CalciatoreDTO {
    private String nome;
    private String cognome;
    private String ruolo;
    private Integer annoNascita;
    private String nazionalita;
    private Double stipendio;
    private Double valoreMercato;
    private Integer presenze;
    private Integer goal;
    private Integer assist;
    private LocalDate contrattoScadenza;
    private Boolean nazionale;
    private Boolean infortunato;
    private AbilitaDTO abilita;
}
