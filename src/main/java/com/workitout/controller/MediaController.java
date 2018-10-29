package com.workitout.controller;

import com.workitout.model.Exercise;
import com.workitout.model.ExerciseRepository;
import com.workitout.model.Media;
import com.workitout.model.MediaRepository;
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
@RequestMapping("/back/medias")
public class MediaController {
    
    @Autowired
    private MediaRepository repo;
    
    @Autowired
    private ExerciseRepository exerRepo;
    
    @PostMapping(value = "/{exerciseId}")
    public Media save (@PathVariable Integer exerciseId, @RequestBody Media media) {
        Exercise exercise = exerRepo.findById(exerciseId).get();
        media.setExercise(exercise);
        return repo.save(media);
    }
    
    @GetMapping(value = "/{id}")
    public Media get (@PathVariable Integer id) {
        return repo.findById(id).get();
    }
    
    @PutMapping(value = "/{id}")
    public Media update (@PathVariable Integer id, @RequestBody Media media) {
        Media med = repo.findById(id).get();
        med.setIndex(media.getIndex());
        if (media.getSource().length > 0) {
            med.setSource(media.getSource());
        }
        med.setUrl(media.getUrl());
        return repo.save(med);
    }
    
    @DeleteMapping(value = "/{id}")
    public String delete (@PathVariable Integer id) {
        repo.deleteById(id);
        return "";
    }
    
    public void delete (Media media) {
        repo.delete(media);
    }
}