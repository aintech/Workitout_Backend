package com.workitout.controller;

import com.workitout.model.WorkoutHistory;
import com.workitout.service.WorkoutHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Aintech
 */
@RestController
@RequestMapping(value = "/back/workout-history")
public class WorkoutHistoryController {

    @Autowired
    private WorkoutHistoryService workoutHistoryService;

    @PostMapping(value = "/{workoutScheduleId}")
    public WorkoutHistory save (@PathVariable Integer workoutScheduleId, @RequestBody WorkoutHistory history) {
        return workoutHistoryService.save(workoutScheduleId, history);
    }

    @GetMapping(value = "/{id}")
    public WorkoutHistory get(@PathVariable Integer id) {
        return workoutHistoryService.get(id);
    }

    @GetMapping
    public Iterable<WorkoutHistory> getAll() {
        return workoutHistoryService.getAll();
    }
}
