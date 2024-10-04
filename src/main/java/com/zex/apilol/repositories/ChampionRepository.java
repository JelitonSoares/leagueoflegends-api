package com.zex.apilol.repositories;

import com.zex.apilol.domain.champion.Champion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface ChampionRepository extends JpaRepository<Champion, UUID> {
    @Query("SELECT c FROM Champion c ORDER BY c.shortName")
    List<Champion> findAllOrderByShortName();
}
