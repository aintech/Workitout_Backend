package com.workitout.controller;

import com.workitout.model.Exercise;
import com.workitout.repository.ExerciseRepository;
import com.workitout.model.Media;
import com.workitout.repository.MediaRepository;
import com.workitout.service.MediaService;
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
@RequestMapping("/back/media")
public class MediaController {

    @Autowired
    private MediaService mediaService;

    @PostMapping(value = "/{exerciseId}")
    public Media save (@PathVariable Integer exerciseId, @RequestBody Media media) {
        return mediaService.save(exerciseId, media);
    }
    
    @GetMapping(value = "/{id}")
    public Media get (@PathVariable Integer id) {
        return mediaService.get(id);
    }
    
    @PutMapping(value = "/{id}")
    public Media update (@PathVariable Integer id, @RequestBody Media media) {
        return mediaService.update(id, media);
    }
    
    @DeleteMapping(value = "/{id}")
    public void delete (@PathVariable Integer id) {
        mediaService.delete(id);
    }
}
