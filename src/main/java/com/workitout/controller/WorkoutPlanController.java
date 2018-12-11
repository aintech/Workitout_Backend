package com.workitout.controller;

import com.workitout.model.WorkoutPlan;
import com.workitout.model.WorkoutPlanRepository;
import com.workitout.model.WorkoutToPlanBinding;
import com.workitout.model.WorkoutToPlanBindingRepository;
import java.util.Iterator;
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
@RequestMapping(value = "/back/workoutplans")
public class WorkoutPlanController {

    @Autowired
    private WorkoutPlanRepository repo;
    
    @Autowired
    private WorkoutToPlanBindingRepository bindingRepo;
    
    @GetMapping
    public Iterable<WorkoutPlan> getAll () {
        return repo.findAll();
    }
    
    @GetMapping(value = "/{id}")
    public WorkoutPlan get (@PathVariable Integer id) {
        return repo.findById(id).get();
    }
    
    @PostMapping
    public WorkoutPlan save (@RequestBody WorkoutPlan workoutPlan) {
        return repo.save(workoutPlan);
    }
    
    @PutMapping
    public WorkoutPlan update(@RequestBody WorkoutPlan workoutPlan) {
        WorkoutPlan plan = repo.findById(workoutPlan.getId()).get();
        plan.setIndex(workoutPlan.getIndex());
        plan.setName(workoutPlan.getName());
        return repo.save(plan);
    }
    
    @DeleteMapping(value = "/{id}")
    public String delete (@PathVariable Integer id) {
        Iterable<WorkoutToPlanBinding> bindings = bindingRepo.getByWorkoutPlanId(id);
        bindingRepo.deleteAll(bindings);
        repo.deleteById(id);
        return "";
    }
}
