package com.workitout.repository;

import com.workitout.model.WorkoutToPlanBinding;
import org.springframework.data.repository.CrudRepository;


/**
 *
 * @author Aintech
 */
public interface WorkoutToPlanBindingRepository extends CrudRepository<WorkoutToPlanBinding, Integer> {
    
    public Iterable<WorkoutToPlanBinding> getByWorkoutPlanId (Integer workoutPlanId);
    
    public Iterable<WorkoutToPlanBinding> getByWorkoutId (Integer workoutId);
}
