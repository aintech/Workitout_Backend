package com.workitout.service;

import com.workitout.model.Round;
import com.workitout.repository.RoundRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class RoundService {

    @Autowired
    private RoundRepository repo;

    @Autowired
    private ExerciseService exerciseService;

    public Round save (Long exerciseId, Round round) {
        round.withExercise(exerciseService.get(exerciseId));
        return repo.save(round);
    }

    public Round get(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Unable to find round with ID " + id));
    }

    public Round update (Long id, Round round) {
        Round rnd = get(id);
        rnd.updateBy(round);
        return repo.save(rnd);
    }

    public void delete (Long id) {
        repo.deleteById(id);
    }
}
