package com.workitout.controller;

import com.workitout.model.Exercise;
import com.workitout.model.ExerciseRepository;
import com.workitout.model.ExerciseType;
import com.workitout.model.MediaRepository;
import com.workitout.model.MuscleGroup;
import com.workitout.model.RoundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

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
    private RoundRepository roundRepo;
    
    @Autowired
    private MediaRepository mediaRepo;

    @GetMapping
    public Iterable<Exercise> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Exercise get (@PathVariable Integer id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Unable to find exercise with ID " + id));
    }

    @GetMapping("/types")
    public Iterable<ExerciseType> getAllTypes() {
        return Arrays.asList(ExerciseType.values());
    }

    @GetMapping("/musclegroups")
    public Iterable<MuscleGroup> getAllMuscleGroups() {
        return Arrays.asList(MuscleGroup.values());
    }

    @PostMapping
    public Exercise save(@RequestBody Exercise exercise) {
        return repo.save(exercise);
    }
    
    @PutMapping(value = "/{id}")
    public Exercise update (@PathVariable Integer id, @RequestBody Exercise exercise) {
        Exercise persisted = get(id);
        persisted.updateBy(exercise);
        return repo.save(persisted);
    }
    
    @DeleteMapping(value = "/{id}")
    public String delete (@PathVariable Integer id) {
        Exercise exercise = get(id);
        exercise.getRounds().forEach(round -> { roundRepo.delete(round); });
        exercise.getMedias().forEach(media -> { mediaRepo.delete(media); });
        repo.delete(exercise);
        return "Successfully deleted!";
    }
}
