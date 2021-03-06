package com.workitout.service;

import com.workitout.model.WorkoutHistory;
import com.workitout.model.WorkoutSchedule;
import com.workitout.repository.WorkoutHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class WorkoutHistoryService {

    @Autowired
    private WorkoutHistoryRepository repo;

    @Autowired
    private WorkoutScheduleService workoutScheduleService;

    public WorkoutHistory save (Long workoutScheduleId, WorkoutHistory history) {
        WorkoutSchedule schedule = workoutScheduleService.get(workoutScheduleId);
        history.withWorkoutSchedule(schedule);
        return repo.save(history);
    }

    public WorkoutHistory get(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Unable to find history with ID " + id));
    }

    public Iterable<WorkoutHistory> getAll() {
        return repo.findAll();
    }
}
