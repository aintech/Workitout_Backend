package com.workitout.model;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Yaremchuk E.N. (aka Aintech)
 */
public interface WorkoutScheduleRepository extends CrudRepository<WorkoutSchedule, Integer> {

    public List<WorkoutSchedule> getByWorkoutId (Integer workoutId);
}
