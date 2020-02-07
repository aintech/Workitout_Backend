package com.workitout.service;

import com.workitout.model.WorkoutPlan;
import com.workitout.model.WorkoutToPlanBinding;
import com.workitout.repository.WorkoutPlanRepository;
import com.workitout.repository.WorkoutToPlanBindingRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class WorkoutPlanService {

    @Autowired
    private WorkoutPlanRepository repo;

    @Autowired
    private WorkoutToPlanBindingRepository bindingRepo;

    public WorkoutPlan save (WorkoutPlan workoutPlan) {
        return repo.save(workoutPlan);
    }

    public WorkoutPlan get (Integer id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Unable to find plan with ID " + id));
    }

    public WorkoutPlan update(WorkoutPlan workoutPlan) {
        WorkoutPlan plan = get(workoutPlan.getId());
        plan.setIndex(workoutPlan.getIndex());
        plan.setName(workoutPlan.getName());
        plan.setScheduled(workoutPlan.isScheduled());
        return repo.save(plan);
    }

    public void delete (Integer id) {
        Iterable<WorkoutToPlanBinding> bindings = bindingRepo.getByWorkoutPlanId(id);
        bindingRepo.deleteAll(bindings);
        repo.deleteById(id);
    }

    public Iterable<WorkoutPlan> getAll () {
        return repo.findAll();
    }
}
