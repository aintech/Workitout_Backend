package com.workitout.controller;

import com.workitout.model.Round;
import com.workitout.service.RoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yaremchuk E.N. (aka Aintech)
 */

@RestController
@RequestMapping("/back/round")
public class RoundController {

    @Autowired
    private RoundService roundService;

    @PostMapping(value = "/{exerciseId}")
    public Round save (@PathVariable Integer exerciseId, @RequestBody Round round) {
        return roundService.save(exerciseId, round);
    }
    
    @PutMapping(value = "/{id}")
    public Round update (@PathVariable Integer id, @RequestBody Round round) {
        return roundService.update(id, round);
    }
    
    @DeleteMapping(value = "/{id}")
    public void delete (@PathVariable Integer id) {
        roundService.delete(id);
    }
}
