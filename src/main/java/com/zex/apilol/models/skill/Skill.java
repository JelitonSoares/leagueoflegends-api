package com.zex.apilol.models.skill;

import com.zex.apilol.dtos.SkillDTO;
import com.zex.apilol.models.champion.Champion;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity(name = "skill")
@Table(name = "skills")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;


    @Column(name = "skill_name")
    private String name;


    @Column(name = "skill_description")
    private String description;


    @Column(name = "skill_type")
    @Enumerated(value = EnumType.STRING)
    private SkillType type;


    @Column(name = "skill_image")
    private String image;


    @Column(name = "skill_video")
    private String video;

    @ManyToOne
    @JoinColumn(name = "champion_id")
    private Champion champion;

    public Skill(SkillDTO data) {
        this.name = data.name();
        this.description = data.description();
        this.type = data.type();
        this.image = data.image();
        this.video = data.video();
    }

}
