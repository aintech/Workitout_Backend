package com.workitout.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Aintech
 */

@Entity
@Table
public class WorkoutToPlanBinding {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private int index;
    
//    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "workout_id")
    @Getter
    @Setter
    private Workout workout;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "workout_plan_id")
    @Getter
    @Setter
    private WorkoutPlan workoutPlan;

    public void withWorkoutPlan(WorkoutPlan workoutPlan) {
        this.workoutPlan = workoutPlan;
    }
}
