package com.workitout.controller;

import com.workitout.model.Exercise;
import com.workitout.model.ExerciseRepository;
import com.workitout.model.RoundRepository;
import com.workitout.model.Workout;
import com.workitout.model.WorkoutRepository;
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
 *
 * @author Aintech
 */

@RestController
@RequestMapping("/back/exercises")
public class ExerciseController {
    
    @Autowired
    private ExerciseRepository repo;
    
    @Autowired
    private WorkoutRepository workRepo;
    
    @GetMapping(value = "/{id}")
    public Exercise show (@PathVariable String id) {
        return repo.findById(Integer.parseInt(id)).get();
    }
    
    @GetMapping()
    public Iterable<Exercise> getAll () {
        return repo.findAll();
    }
    
    @PostMapping(value = "/{workoutId}")
    public Exercise save (@PathVariable String workoutId, @RequestBody Exercise exercise) {
        Workout workout = workRepo.findById(Integer.parseInt(workoutId)).get();
        exercise.setWorkout(workout);
        repo.save(exercise);
        return exercise;
    }
    
    @PutMapping(value = "/{id}")
    public Exercise update (@PathVariable String id, @RequestBody Exercise exercise) {
        Exercise exer = repo.findById(Integer.parseInt(id)).get();
//        exer.setIndex(exercise.getIndex());
        exer.setInstruction(exercise.getInstruction());
//        exer.setMedias(exercise.getMedias());
        exer.setName(exercise.getName());
        exer.setTimeout(exercise.getTimeout());
        exer.setWeight(exercise.getWeight());
//        exer.setWorkouts(exercise.getWorkouts());
        exer.setRounds(exercise.getRounds());
        repo.save(exer);
        return exer;
    }
    
    @DeleteMapping(value = "/{id}")
    public String delete (@PathVariable String id) {
        repo.deleteById(Integer.parseInt(id));
        return "";
    }
}
