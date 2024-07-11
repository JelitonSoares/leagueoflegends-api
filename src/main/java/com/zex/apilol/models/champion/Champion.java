package com.zex.apilol.models.champion;

import com.zex.apilol.dtos.ChampionDTO;
import com.zex.apilol.models.skill.Skill;
import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

@Entity(name = "champion")
@Table(name = "champions")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Champion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;


    @Column(name = "champ_short_name")
    private String shortName;


    @Column(name = "champ_long_name")
    private String longName;


    @Column(name = "champ_lore")
    private String lore;


    @Column(name = "champ_role")
    @Enumerated(value = EnumType.STRING)
    private Role role;


    @Column(name = "champ_difficulty")
    @Enumerated(value = EnumType.STRING)
    private Difficulty difficulty;


    @Column(name = "champ_lane")
    @Enumerated(value = EnumType.STRING)
    private Lane lane;


    @Column(name = "champ_release")
    private LocalDate release;


    @Column(name = "champ_image")
    private String image;

    @OneToMany(mappedBy = "champion", cascade = CascadeType.ALL)
    private Set<Skill> skills;

    public Champion(ChampionDTO data) {
        this.shortName = data.shortName();
        this.longName = data.longName();
        this.lore = data.lore();
        this.role = data.role();
        this.difficulty = data.difficulty();
        this.lane = data.lane();
        this.release = data.release();
        this.image = data.image();
    }


    public void setSkills(Set<Skill> skills) {
        skills.forEach(s ->
                s.setChampion(this));
        this.skills = skills;
    }

}
