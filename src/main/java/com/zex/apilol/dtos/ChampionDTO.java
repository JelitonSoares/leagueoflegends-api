package com.zex.apilol.dtos;

import com.zex.apilol.models.champion.Difficulty;
import com.zex.apilol.models.champion.Lane;
import com.zex.apilol.models.champion.Role;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

public record ChampionDTO(
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
}
