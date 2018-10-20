package com.workitout.controller;

import com.workitout.model.Workout;
import com.workitout.model.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
@RequestMapping(value = "/back/workouts")
public class WorkoutController {
    
    @Autowired
    private WorkoutRepository repo;
    
    @GetMapping
    public Iterable<Workout> getAll () {
        return repo.findAll();
    }
    
    @GetMapping(value = "/{id}")
    public Workout get (@PathVariable String id) {
        return repo.findById(Integer.parseInt(id)).get();
    }
    
    @PostMapping
    public Workout save (@RequestBody Workout workout) {
        repo.save(workout);
        return workout;
    }
    
    @PutMapping(value = "/{id}")
    public Workout update (@PathVariable Integer id, @RequestBody Workout workout) {
        Workout work = repo.findById(id).get();
        work.setName(workout.getName());
        repo.save(work);
        return work;
    }
    
    @DeleteMapping(value = "/{id}")
    public String delete (@PathVariable Integer id) {
        repo.deleteById(id);
        return "";
    }
}