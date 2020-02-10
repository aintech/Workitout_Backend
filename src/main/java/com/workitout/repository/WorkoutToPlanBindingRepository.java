package com.workitout.repository;

import com.workitout.model.WorkoutToPlanBinding;
import org.springframework.data.repository.CrudRepository;


/**
 *
 * @author Aintech
 */
public interface WorkoutToPlanBindingRepository extends CrudRepository<WorkoutToPlanBinding, Long> {
    
    Iterable<WorkoutToPlanBinding> getByWorkoutPlanId (Long workoutPlanId);
    
    Iterable<WorkoutToPlanBinding> getByWorkoutId (Long workoutId);
}
