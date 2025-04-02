package com.example.calcioappbe.repository;

import com.example.calcioappbe.entity.Calciatore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalciatoreRepository extends JpaRepository<Calciatore, Integer> {
    // Metodi personalizzati, se necessari
}
