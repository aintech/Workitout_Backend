package com.workitout.controller;

import com.workitout.model.ExerciseType;
import com.workitout.model.MuscleGroup;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/back/enum")
public class EnumerationController {

    @GetMapping("/types")
    public Iterable<ExerciseType> getAllTypes() {
        return Arrays.asList(ExerciseType.values());
    }

    @GetMapping("/muscle-groups")
    public Iterable<MuscleGroup> getAllMuscleGroups() {
        return Arrays.asList(MuscleGroup.values());
    }
}
