package com.workitout.controller;

import com.workitout.model.Workout;
import com.workitout.repository.WorkoutRepository;
import com.workitout.model.WorkoutSchedule;
import com.workitout.repository.WorkoutScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    
    @Autowired
    private WorkoutScheduleRepository scheduleRepo;
    
    @GetMapping
    public Iterable<WorkoutSchedule> getAll () {
        return repo.findAll();
    }
    
    @GetMapping(value = "/{id}")
    public WorkoutSchedule find (@PathVariable Integer id) {
        return repo.findById(id).get();
    }
    
    @PostMapping(value = "/{workoutId}")
    public WorkoutSchedule save (@PathVariable Integer workoutId, @RequestBody WorkoutSchedule workoutSchedule) {
        Workout workout = workRepo.findById(workoutId).get();
        workoutSchedule.setWorkout(workout);
        WorkoutSchedule saved = repo.save(workoutSchedule);
        return saved;
    }
    
    @PutMapping(value = "/{workoutScheduleId}")
    public WorkoutSchedule update (@PathVariable Integer workoutScheduleId, @RequestBody WorkoutSchedule workoutSchedule) {
        WorkoutSchedule schedule = scheduleRepo.findById(workoutScheduleId).get();
        schedule.setPerformed(workoutSchedule.isPerformed());
        WorkoutSchedule saved = scheduleRepo.save(schedule);
        return saved;
    }
    
    @DeleteMapping(value = "/{id}")
    public String delete (@PathVariable Integer id) {
        WorkoutSchedule schedule = repo.findById(id).get();
        repo.delete(schedule);
        return "";
    }
}
