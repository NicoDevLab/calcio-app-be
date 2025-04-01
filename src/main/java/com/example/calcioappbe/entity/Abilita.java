package com.example.calcioappbe.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ABILITA")
public class Abilita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "calciatore_id", referencedColumnName = "id")
    private Calciatore calciatore;

    // Abilità tecniche
    @Column(name = "passaggio")
    private Integer passaggio;

    @Column(name = "tiro")
    private Integer tiro;

    @Column(name = "dribbling")
    private Integer dribbling;

    @Column(name = "controllo_palla")
    private Integer controlloPalla;

    @Column(name = "crossing")
    private Integer crossing;

    @Column(name = "rigori")
    private Integer rigori;

    @Column(name = "calci_piazzati")
    private Integer calciPiazzati;

    // Abilità fisiche
    @Column(name = "velocita")
    private Integer velocita;

    @Column(name = "accelerazione")
    private Integer accelerazione;

    @Column(name = "resistenza")
    private Integer resistenza;

    @Column(name = "forza")
    private Integer forza;

    @Column(name = "elevazione")
    private Integer elevazione;

    @Column(name = "agilita")
    private Integer agilita;

    // Abilità difensive
    @Column(name = "contrasto")
    private Integer contrasto;

    @Column(name = "intercetti")
    private Integer intercetti;

    @Column(name = "posizionamento_difensivo")
    private Integer posizionamentoDifensivo;

    @Column(name = "marcatura")
    private Integer marcatura;

    // Abilità mentali
    @Column(name = "visione_di_gioco")
    private Integer visioneDiGioco;

    @Column(name = "concentrazione")
    private Integer concentrazione;

    @Column(name = "leadership")
    private Integer leadership;

    @Column(name = "aggressivita")
    private Integer aggressivita;

    @Column(name = "carisma")
    private Integer carisma;

    @Column(name = "coraggio")
    private Integer coraggio;

    // Abilità per portieri (opzionali)
    @Column(name = "tuffi")
    private Integer tuffi;

    @Column(name = "presa")
    private Integer presa;

    @Column(name = "riflessi")
    private Integer riflessi;

    @Column(name = "rinvio")
    private Integer rinvio;

    @Column(name = "posizionamento_portiere")
    private Integer posizionamentoPortiere;
}
