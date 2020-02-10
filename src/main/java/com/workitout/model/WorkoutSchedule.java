package com.workitout.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Yaremchuk E.N. (aka Aintech)
 */
@Entity
@Table
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class WorkoutSchedule implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "workout_id")
    @Getter
    @Setter
    private Workout workout;
    
    @Temporal(TemporalType.DATE)
    @Getter
    @Setter
    private Date date;

    @Getter
    @Setter
    private boolean performed;

    @OneToMany(mappedBy = "workoutSchedule")
    @Getter
    @Setter
    private List<WorkoutHistory> workoutHistories;

    public void withWorkout(Workout workout) {
        this.workout = workout;
    }

    public void updateBy(WorkoutSchedule workoutSchedule) {
        performed = workoutSchedule.performed;
    }
}
