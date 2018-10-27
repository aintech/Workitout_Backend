package com.workitout.controller;

import com.workitout.model.Workout;
import com.workitout.model.WorkoutRepository;
import com.workitout.model.WorkoutSchedule;
import com.workitout.model.WorkoutScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yaremchuk E.N. (aka Aintech)
 */

@RestController
@RequestMapping(value = "/back/workoutschedules")
public class WorkoutScheduleController {
    
    @Autowired
    private WorkoutScheduleRepository repo;
    
    @Autowired
    private WorkoutRepository workRepo;
    
    @GetMapping
    public Iterable<WorkoutSchedule> getAll () {
        return repo.findAll();
    }
    
    @PostMapping(value = "/{workoutId}")
    public WorkoutSchedule save (@PathVariable Integer workoutId, @RequestBody WorkoutSchedule workoutSchedule) {
        Workout workout = workRepo.findById(workoutId).get();
        workoutSchedule.setWorkout(workout);
        repo.save(workoutSchedule);
        return workoutSchedule;
    }
    
    @DeleteMapping(value = "/{id}")
    public String delete (@PathVariable Integer id) {
        WorkoutSchedule schedule = repo.findById(id).get();
        repo.delete(schedule);
        return "";
    }
}
