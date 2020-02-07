package com.workitout.repository;

import com.workitout.model.Workout;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Yaremchuk E.N. (aka Aintech)
 */
public interface WorkoutRepository extends CrudRepository<Workout, Integer> {}
