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
import java.util.stream.Collectors;

@Service
public class ChampionService {
    @Autowired
    private ChampionRepository repository;

    @Transactional
    public Champion save(ChampionDTO data) {
        Set<Skill> skills = data.skills().stream()
                .map(Skill::new)
                .collect(Collectors.toSet());

        Champion champion = new Champion(data);
        champion.setSkills(skills);

        return this.repository.save(champion);
    }


    public List<Champion> getAllChampions() {
        return this.repository.findAll();
    }
}
