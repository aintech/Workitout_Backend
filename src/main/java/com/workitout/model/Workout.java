package com.workitout.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author Yaremchuk E.N. (aka Aintech)
 */

@Entity
@Table
public class Workout implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer id;

    @Getter
    @Setter
    private String name;

    @ManyToMany
    @JoinTable(
            name = "workout_to_exercise",
            joinColumns = @JoinColumn(name = "workout_id"),
            inverseJoinColumns = @JoinColumn(name = "exercise_id")
    )
    @Setter
    private List<Exercise> exercises;

    public void updateBy(Workout workout) {
        name = workout.name;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }
//    @OneToMany(mappedBy = "workout")
//    private List<WorkoutSchedule> workoutSchedulers;
}
