package com.peraltarp.dsmovie.repositories;


import com.peraltarp.dsmovie.entities.Score;
import com.peraltarp.dsmovie.entities.ScorePk;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePk>{
    
}
