package com.workitout.service;

import com.workitout.model.WorkoutPlan;
import com.workitout.model.WorkoutToPlanBinding;
import com.workitout.repository.WorkoutToPlanBindingRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class WorkoutPlanToBindingService {

    @Autowired
    private WorkoutToPlanBindingRepository repo;

    @Autowired
    private WorkoutPlanService workoutPlanService;

    public WorkoutToPlanBinding save (Integer workoutPlanId, WorkoutToPlanBinding binding) {
        WorkoutPlan plan = workoutPlanService.get(workoutPlanId);
        binding.setWorkoutPlan(plan);
        return repo.save(binding);
    }

    public void delete (Integer id) {
        repo.deleteById(id);
    }
}
