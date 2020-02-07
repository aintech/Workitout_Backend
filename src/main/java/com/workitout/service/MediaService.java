package com.workitout.service;

import com.workitout.model.Exercise;
import com.workitout.model.Media;
import com.workitout.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class MediaService {

    @Autowired
    private MediaRepository repo;

    @Autowired
    private ExerciseService exerciseService;

    public Media save(Integer exerciseId, Media media) {
        Exercise exercise = exerciseService.get(exerciseId);
        media.setExercise(exercise);
        return repo.save(media);
    }

    public Media get (Integer id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Unable to find media with ID " + id));
    }

    public Media update (Integer id, Media media) {
        Media med = get(id);
        med.setIndex(media.getIndex());
        if (media.getSource().length > 0) {
            med.setSource(media.getSource());
        }
        med.setUrl(media.getUrl());
        return repo.save(med);
    }

    public void delete (Integer id) {
        repo.deleteById(id);
    }
}
