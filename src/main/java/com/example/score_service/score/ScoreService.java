package com.example.score_service.score;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {
    public List<ScoreItem> getScores(){
        return List.of(
                new ScoreItem(1L,"James", 7)
        );
    }
}
