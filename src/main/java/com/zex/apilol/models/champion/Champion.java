package com.zex.apilol.models.champion;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDate;
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

}
