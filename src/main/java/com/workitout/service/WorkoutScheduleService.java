package com.workitout.service;

import com.workitout.model.Workout;
import com.workitout.model.WorkoutSchedule;
import com.workitout.repository.WorkoutScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public class WorkoutScheduleService {

    @Autowired
    private WorkoutScheduleRepository repo;

    @Autowired
    private WorkoutService workoutService;

    public WorkoutSchedule save (Integer workoutId, @RequestBody WorkoutSchedule workoutSchedule) {
        Workout workout = workoutService.get(workoutId);
        workoutSchedule.setWorkout(workout);
        return repo.save(workoutSchedule);
    }

    public WorkoutSchedule get (Integer id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Unable to find schedule with ID " + id));
    }

    public WorkoutSchedule update (Integer workoutScheduleId, WorkoutSchedule workoutSchedule) {
        WorkoutSchedule schedule = get(workoutScheduleId);
        schedule.setPerformed(workoutSchedule.isPerformed());
        return repo.save(schedule);
    }

    public void delete (@PathVariable Integer id) {
        repo.deleteById(id);
    }

    @GetMapping
    public Iterable<WorkoutSchedule> getAll () {
        return repo.findAll();
    }
}
