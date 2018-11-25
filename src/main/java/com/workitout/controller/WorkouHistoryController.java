package com.workitout.controller;

import com.workitout.model.WorkoutHistory;
import com.workitout.model.WorkoutHistoryRepository;
import com.workitout.model.WorkoutSchedule;
import com.workitout.model.WorkoutScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping(value = "/back/workouthistories")
public class WorkouHistoryController {

    @Autowired
    private WorkoutHistoryRepository repo;
    
    @Autowired
    private WorkoutScheduleRepository scheduleRepo;
    
    @PostMapping(value = "/{workoutScheduleId}")
    public WorkoutHistory save (@PathVariable Integer workoutScheduleId, @RequestBody WorkoutHistory history) {
        WorkoutSchedule schedule = scheduleRepo.findById(workoutScheduleId).get();
        history.setWorkoutSchedule(schedule);
        return repo.save(history);
    }
    
    public void delete (WorkoutHistory history) {
        repo.delete(history);
    }
}
