package com.workitout.model;

import org.springframework.data.repository.CrudRepository;


/**
 *
 * @author Aintech
 */
public interface WorkoutToPlanBindingRepository extends CrudRepository<WorkoutToPlanBinding, Integer> {
    
    public Iterable<WorkoutToPlanBinding> getByWorkoutPlanId (Integer workoutPlanId);
}
