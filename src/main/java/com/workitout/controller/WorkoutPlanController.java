package com.workitout.controller;

import com.workitout.model.WorkoutPlan;
import com.workitout.service.WorkoutPlanService;
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
 *
 * @author Aintech
 */

@RestController
@RequestMapping(value = "/back/workout-plan")
public class WorkoutPlanController {

    @Autowired
    WorkoutPlanService workoutPlanService;

    @GetMapping(value = "/{id}")
    public WorkoutPlan get (@PathVariable Integer id) {
        return workoutPlanService.get(id);
    }
    
    @PostMapping
    public WorkoutPlan save (@RequestBody WorkoutPlan workoutPlan) {
        return workoutPlanService.save(workoutPlan);
    }
    
    @PutMapping
    public WorkoutPlan update(@RequestBody WorkoutPlan workoutPlan) {
        return workoutPlanService.update(workoutPlan);
    }
    
    @DeleteMapping(value = "/{id}")
    public void delete (@PathVariable Integer id) {
        workoutPlanService.delete(id);
    }

    @GetMapping
    public Iterable<WorkoutPlan> getAll () {
        return workoutPlanService.getAll();
    }
}
