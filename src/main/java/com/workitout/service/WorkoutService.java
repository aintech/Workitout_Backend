package com.workitout.service;

import com.workitout.model.Workout;
import com.workitout.model.WorkoutSchedule;
import com.workitout.model.WorkoutToPlanBinding;
import com.workitout.repository.ExerciseRepository;
import com.workitout.repository.MediaRepository;
import com.workitout.repository.RoundRepository;
import com.workitout.repository.WorkoutRepository;
import com.workitout.repository.WorkoutScheduleRepository;
import com.workitout.repository.WorkoutToPlanBindingRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class WorkoutService {

    @Autowired
    private WorkoutRepository repo;

    @Autowired
    private WorkoutScheduleRepository scheduleRepo;

    @Autowired
    private ExerciseRepository exerciseRepo;

    @Autowired
    private RoundRepository roundRepo;

    @Autowired
    private MediaRepository mediaRepo;

    @Autowired
    private WorkoutToPlanBindingRepository bindingRepo;

    public Workout save (Workout workout) {
        return repo.save(workout);
    }

    public Workout get (Integer id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Unable to find workout with ID " + id));
    }

    public Workout update (Integer id, Workout workout) {
        Workout work = get(id);
        work.setName(workout.getName());
        repo.save(work);
        return work;
    }

    public void delete (Integer id) {
        Workout workout = get(id);
        List<WorkoutSchedule> schedules = scheduleRepo.getByWorkoutId(id);
        scheduleRepo.deleteAll(schedules);
        Iterable<WorkoutToPlanBinding> bindings = bindingRepo.getByWorkoutId(id);
        bindingRepo.deleteAll(bindings);
        workout.getExercises().forEach(exercise -> {
            exercise.getRounds().forEach(round -> roundRepo.delete(round));
            exercise.getMedias().forEach(media -> mediaRepo.delete(media));
            exerciseRepo.delete(exercise);
        });
        repo.delete(workout);
    }

    public Iterable<Workout> getAll () {
        return repo.findAll();
    }
}
