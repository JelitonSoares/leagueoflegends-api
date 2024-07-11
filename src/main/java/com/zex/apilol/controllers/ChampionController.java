package com.zex.apilol.controllers;

import com.zex.apilol.dtos.ChampionDTO;
import com.zex.apilol.models.champion.Champion;
import com.zex.apilol.services.ChampionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apilol/champions")
public class ChampionController {
    @Autowired
    private ChampionService service;

    @PostMapping
    public ResponseEntity<Champion> saveChampion(@RequestBody @Valid ChampionDTO data) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(data));
    }
}
