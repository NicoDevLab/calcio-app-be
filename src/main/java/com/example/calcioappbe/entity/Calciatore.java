package com.example.calcioappbe.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CALCIATORE")
public class Calciatore {
    @Id
    @GeneratedValue
    @Column
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cognome")
    private String cognome;

    @Column(name = "ruolo")
    private String ruolo;

    @OneToOne(mappedBy = "calciatore", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Abilita abilita;

    @Column(name = "anno_nascita")
    private Integer annoNascita;

    @Column(name = "nazionalita")
    private String nazionalita;

    @Column(name = "stipendio")
    private Double stipendio; // in euro, annuale

    @Column(name = "valore_mercato")
    private Double valoreMercato; // in euro

    @Column(name = "presenze")
    private Integer presenze;

    @Column(name = "goal")
    private Integer goal;

    @Column(name = "assist")
    private Integer assist;

    @Column(name = "contratto_scadenza")
    private LocalDate contrattoScadenza;

    @Column(name = "nazionale")
    private Boolean nazionale; // true se gioca o è convocabile

    @Column(name = "infortunato")
    private Boolean infortunato; // true se indisponibile

}
