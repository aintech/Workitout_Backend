package com.workitout.service;

import com.workitout.model.Round;
import com.workitout.repository.RoundRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class RoundService {

    @Autowired
    private RoundRepository repo;

    @Autowired
    private ExerciseService exerciseService;

    public Round save (Integer exerciseId, Round round) {
        round.setExercise(exerciseService.get(exerciseId));
        return repo.save(round);
    }

    public Round get(Integer id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Unable to find round with ID " + id));
    }

    public Round update (Integer id, Round round) {
        Round rnd = get(id);
        rnd.setIndex(round.getIndex());
        rnd.setRepeat(round.getRepeat());
        rnd.setTimeout(round.getTimeout());
        return repo.save(rnd);
    }

    public void delete (Integer id) {
        repo.deleteById(id);
    }
}
