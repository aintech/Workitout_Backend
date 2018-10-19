package com.workitout.controller;

import com.workitout.model.ExerciseRepository;
import com.workitout.model.Round;
import com.workitout.model.RoundRepository;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/back/rounds")
public class RoundController {
    
    @Autowired
    private RoundRepository repo;
    
    @Autowired
    private ExerciseRepository exerRepo;
    
    @PostMapping(value = "/{exerciseId}")
    public Round save (@PathVariable Integer exerciseId, @RequestBody Round round) {
        round.setExercise(exerRepo.findById(exerciseId).get());
        repo.save(round);
        return round;
    }
    
    @PutMapping()
    public Round update (@RequestBody Round round) {
        Round rnd = repo.findById(round.getId()).get();
        rnd.setIndex(round.getIndex());
        rnd.setRepeat(round.getRepeat());
        rnd.setTimeout(round.getTimeout());
        repo.save(rnd);
        return rnd;
    }
    
    @GetMapping()
    public Iterable<Round> getAll () {
        return repo.findAll();
    }
}
