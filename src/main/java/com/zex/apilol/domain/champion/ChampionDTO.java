package com.zex.apilol.domain.champion;

import com.zex.apilol.domain.skill.SkillDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public record ChampionDTO(UUID id,
                          @NotBlank
                          String shortName,
                          @NotBlank
                          String longName,
                          @NotBlank
                          String lore,
                          @NotNull
                          Role role,
                          @NotNull
                          Difficulty difficulty,
                          @NotNull
                          Lane lane,
                          @NotNull
                          LocalDate release,
                          @NotBlank
                          String image,
                          @NotNull
                          @Valid
                          Set<SkillDTO> skills) {

    public ChampionDTO(Champion champion) {
        this(champion.getId(), champion.getShortName(), champion.getLongName(), champion.getLore(), champion.getRole(), champion.getDifficulty(),
                champion.getLane(), champion.getRelease(), champion.getImage(), champion.getSkills().stream()
                        .map(s -> new SkillDTO(s))
                        .collect(Collectors.toSet()));

    }

}
