package com.workitout.controller;

import com.workitout.model.WorkoutSchedule;
import com.workitout.service.WorkoutScheduleService;
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
@RequestMapping(value = "/back/workout-schedule")
public class WorkoutScheduleController {
    
    @Autowired
    private WorkoutScheduleService workoutScheduleService;

    @PostMapping(value = "/{workoutId}")
    public WorkoutSchedule save (@PathVariable Long workoutId, @RequestBody WorkoutSchedule workoutSchedule) {
        return workoutScheduleService.save(workoutId, workoutSchedule);
    }

    @GetMapping(value = "/{id}")
    public WorkoutSchedule get (@PathVariable Long id) {
        return workoutScheduleService.get(id);
    }

    @PutMapping(value = "/{workoutScheduleId}")
    public WorkoutSchedule update (@PathVariable Long workoutScheduleId, @RequestBody WorkoutSchedule workoutSchedule) {
        return workoutScheduleService.update(workoutScheduleId, workoutSchedule);
    }
    
    @DeleteMapping(value = "/{id}")
    public void delete (@PathVariable Long id) {
        workoutScheduleService.delete(id);
    }

    @GetMapping
    public Iterable<WorkoutSchedule> getAll () {
        return workoutScheduleService.getAll();
    }
}
