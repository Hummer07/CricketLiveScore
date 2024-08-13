package com.example.CricketDetails.Controller;



import com.example.CricketDetails.Dto.ScoreDto;
import com.example.CricketDetails.Service.CricketScoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cricket")
public class CricketController {

    private final CricketScoreService cricketScoreService;

    public CricketController(CricketScoreService cricketScoreService) {
        this.cricketScoreService = cricketScoreService;
    }

    @GetMapping("/live-score")
    public ScoreDto getLiveScore() {
        return cricketScoreService.getLiveScore();
    }
}
