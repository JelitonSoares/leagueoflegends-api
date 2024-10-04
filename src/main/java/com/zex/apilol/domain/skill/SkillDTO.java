package com.zex.apilol.domain.skill;

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


    public SkillDTO(Skill skill) {
        this(skill.getName(), skill.getDescription(), skill.getType(), skill.getImage(), skill.getVideo());
    }
}
