package com.workitout.service;

import com.workitout.model.Workout;
import com.workitout.model.WorkoutSchedule;
import com.workitout.repository.WorkoutScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class WorkoutScheduleService {

    @Autowired
    private WorkoutScheduleRepository repo;

    @Autowired
    private WorkoutService workoutService;

    public WorkoutSchedule save (Long workoutId, WorkoutSchedule workoutSchedule) {
        Workout workout = workoutService.get(workoutId);
        workoutSchedule.withWorkout(workout);
        return repo.save(workoutSchedule);
    }

    public WorkoutSchedule get (Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Unable to find schedule with ID " + id));
    }

    public WorkoutSchedule update (Long id, WorkoutSchedule workoutSchedule) {
        WorkoutSchedule schedule = get(id);
        schedule.updateBy(workoutSchedule);
        return repo.save(schedule);
    }

    public void delete (Long id) {
        repo.deleteById(id);
    }

    public Iterable<WorkoutSchedule> getAll () {
        return repo.findAll();
    }
}
