package com.workitout.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
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
@Table(name = "_workout_to_plan_binding")
public class WorkoutToPlanBinding {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "_id")
    private int id;
    
    @Column(name = "_index")
    private int index;
    
//    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "_workout_id")
    private Workout workout;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "_workout_plan_id")
    private WorkoutPlan workoutPlan;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getIndex() { return index; }
    public void setIndex(int index) { this.index = index; }

    public Workout getWorkout() { return workout; }
    public void setWorkout(Workout workout) { this.workout = workout; }

    public WorkoutPlan getWorkoutPlan() { return workoutPlan; }
    public void setWorkoutPlan(WorkoutPlan workoutPlan) { this.workoutPlan = workoutPlan; }
}
