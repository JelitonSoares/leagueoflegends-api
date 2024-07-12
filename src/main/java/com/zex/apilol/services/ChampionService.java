package com.zex.apilol.services;

import com.zex.apilol.dtos.ChampionDTO;
import com.zex.apilol.models.champion.Champion;
import com.zex.apilol.models.skill.Skill;
import com.zex.apilol.repositories.ChampionRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ChampionService {
    @Autowired
    private ChampionRepository repository;

    @Transactional
    public ChampionDTO save(ChampionDTO data) {
        List<Skill> skills = data.skills().stream()
                .map(Skill::new)
                .collect(Collectors.toList());

        Champion champion = new Champion(data);
        champion.setSkills(skills);

        return new ChampionDTO(this.repository.save(champion));
    }


    public List<ChampionDTO> getAllChampions() {

        List<ChampionDTO> champions = this.repository.findAll().stream()
                .map(c -> new ChampionDTO(c))
                .collect(Collectors.toList());

        return champions;
    }


    @Transactional
    public void delete(UUID id) {
        Champion champion = this.repository.getReferenceById(id);

        this.repository.delete(champion);
    }

    public ChampionDTO update(ChampionDTO data) {
        Champion champion = this.repository.getReferenceById(data.id());

        champion.updateChampion(data);

        return new ChampionDTO(this.repository.save(champion));
    }
}
