package com.workitout.controller;

import com.workitout.model.Workout;
import com.workitout.service.WorkoutService;
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
@RequestMapping(value = "/back/workout")
public class WorkoutController {

    @Autowired
    private WorkoutService workoutService;

    @PostMapping
    public Workout save (@RequestBody Workout workout) {
        return workoutService.save(workout);
    }

    @GetMapping(value = "/{id}")
    public Workout get (@PathVariable Long id) {
        return workoutService.get(id);
    }

    @PutMapping(value = "/{id}")
    public Workout update (@PathVariable Long id, @RequestBody Workout workout) {
        return workoutService.update(id, workout);
    }
    
    @DeleteMapping(value = "/{id}")
    public void delete (@PathVariable Long id) {
        workoutService.delete(id);
    }

    @GetMapping
    public Iterable<Workout> getAll () {
        return workoutService.getAll();
    }
}
