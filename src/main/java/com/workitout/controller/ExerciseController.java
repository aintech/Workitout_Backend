package com.workitout.controller;

import com.workitout.model.Exercise;
import com.workitout.service.ExerciseService;
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
@RequestMapping("/back/exercise")
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;

    @PostMapping
    public Exercise save(@RequestBody Exercise exercise) {
        return exerciseService.save(exercise);
    }

    @GetMapping("/{id}")
    public Exercise get (@PathVariable Long id) {
        return exerciseService.get(id);
    }

    @PutMapping(value = "/{id}")
    public Exercise update (@PathVariable Long id, @RequestBody Exercise exercise) {
        return exerciseService.update(id, exercise);
    }
    
    @DeleteMapping(value = "/{id}")
    public void delete (@PathVariable Long id) {
        exerciseService.delete(id);
    }

    @GetMapping
    public Iterable<Exercise> getAll() {
        return exerciseService.getAll();
    }
}
