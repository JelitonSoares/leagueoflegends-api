package com.zex.apilol.dtos;

import com.zex.apilol.models.skill.SkillType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record SkillDTO(@NotBlank String name,
                       @NotBlank
                       String description,
                       @NotNull
                       SkillType type,
                       @NotBlank
                       String image,
                       @NotBlank
                       String video) {
}
