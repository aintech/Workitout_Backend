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

    public Media save(Long exerciseId, Media media) {
        Exercise exercise = exerciseService.get(exerciseId);
        media.withExercise(exercise);
        return repo.save(media);
    }

    public Media get (Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Unable to find media with ID " + id));
    }

    public Media update (Long id, Media media) {
        Media med = get(id);
        med.updateBy(media);
        return repo.save(med);
    }

    public void delete (Long id) {
        repo.deleteById(id);
    }
}
