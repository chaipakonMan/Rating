package com.example.rating.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("rating")
public class RatingController {

    @GetMapping("/healthcheck")
    public String healthcheck(){
        return "healthy!";
    }

    @PostMapping("/addRecord")
    public double addRecord(@RequestHeader String ags, @RequestHeader String cr, @RequestHeader String sr){
        double scoreDifferential = calcuateScoreDifferential(ags, cr, sr);
        // insert new record to DB: probably userKey:ScoreDifferential
        return scoreDifferential;
    }

    private double calcuateScoreDifferential(@RequestHeader String ags, @RequestHeader String cr, @RequestHeader String sr){
        //(AGS - CR) x 113 / SR
        double scoreDifferential = (((Double.parseDouble(ags) - Double.parseDouble(cr)) * 113) / Double.parseDouble(sr));
        return scoreDifferential;
    }

}
