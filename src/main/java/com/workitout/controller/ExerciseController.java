package com.workitout.controller;

import com.workitout.model.Exercise;
import com.workitout.model.ExerciseRepository;
import com.workitout.model.MediaRepository;
import com.workitout.model.RoundRepository;
import com.workitout.model.Workout;
import com.workitout.model.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
    
    @Autowired
    private RoundRepository roundRepo;
    
    @Autowired
    private MediaRepository mediaRepo;
    
    @PostMapping(value = "/{workoutId}")
    public Exercise save (@PathVariable Integer workoutId, @RequestBody Exercise exercise) {
        Workout workout = workRepo.findById(workoutId).get();
        exercise.setWorkout(workout);
        return repo.save(exercise);
    }
    
    @PutMapping(value = "/{id}")
    public Exercise update (@PathVariable Integer id, @RequestBody Exercise exercise) {
        Exercise exer = repo.findById(id).get();
        exer.setIndex(exercise.getIndex());
        exer.setInstruction(exercise.getInstruction());
        exer.setName(exercise.getName());
        exer.setExternalLink(exercise.getExternalLink());
        exer.setTimeout(exercise.getTimeout());
        exer.setWeight(exercise.getWeight());
        return repo.save(exer);
    }
    
    @DeleteMapping(value = "/{id}")
    public String delete (@PathVariable Integer id) {
        Exercise exercise = repo.findById(id).get();
        exercise.getRounds().forEach(round -> { roundRepo.delete(round); });
        exercise.getMedias().forEach(media -> { mediaRepo.delete(media); });
        repo.delete(exercise);
        return "";
    }
}
