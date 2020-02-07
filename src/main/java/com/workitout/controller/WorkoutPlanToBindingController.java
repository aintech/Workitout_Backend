package com.workitout.controller;

import com.workitout.model.WorkoutToPlanBinding;
import com.workitout.service.WorkoutPlanToBindingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
@RequestMapping(value = "/back/workout-plan-binding")
public class WorkoutPlanToBindingController {
    
    @Autowired
    WorkoutPlanToBindingService workoutPlanToBindingService;

    @PostMapping(value = "/{workoutPlanId}")
    public WorkoutToPlanBinding save (@PathVariable Integer workoutPlanId, @RequestBody WorkoutToPlanBinding binding) {
        return workoutPlanToBindingService.save(workoutPlanId, binding);
    }
    
    @DeleteMapping(value = "/{id}")
    public void delete (@PathVariable Integer id) {
        workoutPlanToBindingService.delete(id);
    }
}
