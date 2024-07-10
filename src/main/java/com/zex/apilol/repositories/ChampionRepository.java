package com.zex.apilol.repositories;

import com.zex.apilol.models.champion.Champion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ChampionRepository extends JpaRepository<Champion, UUID> {
}
