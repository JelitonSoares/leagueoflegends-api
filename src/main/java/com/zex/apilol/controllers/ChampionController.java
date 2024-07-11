package com.zex.apilol.controllers;

import com.zex.apilol.dtos.ChampionDTO;
import com.zex.apilol.models.champion.Champion;
import com.zex.apilol.services.ChampionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apilol/champions")
public class ChampionController {
    @Autowired
    private ChampionService service;

    @PostMapping
    public void saveChampion(@RequestBody @Valid ChampionDTO data) {
        this.service.save(data);
    }

    @GetMapping
    public ResponseEntity<List<Champion>> getAllChampion() {
        return ResponseEntity.status(HttpStatus.OK).body(this.service.getAllChampions());
    }
}
