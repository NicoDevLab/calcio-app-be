package com.example.calcioappbe.controller;

import com.example.calcioappbe.dto.CalciatoreDTO;
import com.example.calcioappbe.entity.Abilita;
import com.example.calcioappbe.entity.Calciatore;
import com.example.calcioappbe.repository.CalciatoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/calciatori")
public class CalciatoreController {
    @Autowired
    private CalciatoreRepository calciatoreRepository;

    @GetMapping
    public List<Calciatore> getAllCalciatori() {
        return calciatoreRepository.findAll();
    }

}
