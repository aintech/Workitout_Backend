package com.workitout.service;

import com.workitout.model.Exercise;
import com.workitout.repository.ExerciseRepository;
import com.workitout.repository.MediaRepository;
import com.workitout.repository.RoundRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ExerciseService {

    @Autowired
    private ExerciseRepository repo;

    @Autowired
    private RoundRepository roundRepo;

    @Autowired
    private MediaRepository mediaRepo;

    public Exercise save(Exercise exercise) {
        return repo.save(exercise);
    }

    public Exercise get (Integer id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Unable to find exercise with ID " + id));
    }

    public Exercise update (Integer id, Exercise exercise) {
        Exercise persisted = get(id);
        persisted.updateBy(exercise);
        return repo.save(persisted);
    }

    public void delete (Integer id) {
        Exercise exercise = get(id);
        exercise.getRounds().forEach(round -> { roundRepo.delete(round); });
        exercise.getMedias().forEach(media -> { mediaRepo.delete(media); });
        repo.delete(exercise);
    }

    public Iterable<Exercise> getAll() {
        return repo.findAll();
    }
}
