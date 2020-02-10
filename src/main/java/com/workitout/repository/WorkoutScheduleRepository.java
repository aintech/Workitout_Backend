package com.workitout.repository;

import java.util.List;

import com.workitout.model.WorkoutSchedule;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Yaremchuk E.N. (aka Aintech)
 */
public interface WorkoutScheduleRepository extends CrudRepository<WorkoutSchedule, Long> {

    List<WorkoutSchedule> getByWorkoutId (Long workoutId);
}
