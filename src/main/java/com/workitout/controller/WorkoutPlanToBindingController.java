package com.workitout.controller;

import com.workitout.model.WorkoutPlan;
import com.workitout.model.WorkoutPlanRepository;
import com.workitout.model.WorkoutToPlanBinding;
import com.workitout.model.WorkoutToPlanBindingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Aintech
 */

@RestController
@RequestMapping(value = "/back/workoutplanbindings")
public class WorkoutPlanToBindingController {
    
    @Autowired
    private WorkoutToPlanBindingRepository repo;
    
    @Autowired
    private WorkoutPlanRepository planRepo;
    
    @PostMapping(value = "/{workoutPlanId}")
    public WorkoutToPlanBinding save (@PathVariable Integer workoutPlanId, @RequestBody WorkoutToPlanBinding binding) {
        WorkoutPlan plan = planRepo.findById(workoutPlanId).get();
        binding.setWorkoutPlan(plan);
        return repo.save(binding);
    }
}
