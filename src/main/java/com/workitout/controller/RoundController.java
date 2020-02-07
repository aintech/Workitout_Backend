package com.workitout.controller;

import com.workitout.repository.ExerciseRepository;
import com.workitout.model.Round;
import com.workitout.repository.RoundRepository;
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
@RequestMapping("/back/rounds")
public class RoundController {
    
    @Autowired
    private RoundRepository repo;
    
    @Autowired
    private ExerciseRepository exerRepo;
    
    @PostMapping(value = "/{exerciseId}")
    public Round save (@PathVariable Integer exerciseId, @RequestBody Round round) {
        round.setExercise(exerRepo.findById(exerciseId).get());
        return repo.save(round);
    }
    
    @PutMapping(value = "/{id}")
    public Round update (@PathVariable Integer id, @RequestBody Round round) {
        Round rnd = repo.findById(id).get();
        rnd.setIndex(round.getIndex());
        rnd.setRepeat(round.getRepeat());
        rnd.setTimeout(round.getTimeout());
        return repo.save(rnd);
    }
    
    @DeleteMapping(value = "/{id}")
    public String delete (@PathVariable Integer id) {
        repo.deleteById(id);
        return "";
    }
    
    public void delete (Round round) {
        repo.delete(round);
    }
}
