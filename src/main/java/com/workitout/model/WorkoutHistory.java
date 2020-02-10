package com.workitout.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
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
public class WorkoutHistory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int id;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "workout_schedule_id")
    @Getter
    @Setter
    private WorkoutSchedule workoutSchedule;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private int index;

    @Getter
    @Setter
    private int weight;

    @Getter
    @Setter
    private String repeats;

    public void withWorkoutSchedule(WorkoutSchedule workoutSchedule) {
        this.workoutSchedule = workoutSchedule;
    }
}
