package com.zex.apilol.controllers;

import com.zex.apilol.domain.champion.ChampionDTO;
import com.zex.apilol.services.ChampionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/apilol/champions")
public class ChampionController {
    @Autowired
    private ChampionService service;

    @PostMapping
    public ResponseEntity<ChampionDTO> saveChampion(@RequestBody @Valid ChampionDTO data) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(data));
    }

    @GetMapping
    public ResponseEntity<List<ChampionDTO>> getAllChampion() {
        return ResponseEntity.status(HttpStatus.OK).body(this.service.getAllChampions());
    }

    @DeleteMapping("/{id}")
    public void deleteChampion(@PathVariable UUID id) {
        this.service.delete(id);
    }

    @PutMapping
    public ResponseEntity<ChampionDTO> updateChampion(@RequestBody ChampionDTO data) {
        return ResponseEntity.status(HttpStatus.OK).body(this.service.update(data));
    }


}
