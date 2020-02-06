package com.workitout.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;
    
    @Column
    private String name;

    @ManyToMany
    @JoinTable(
            name = "workout_to_exercise",
            joinColumns = @JoinColumn(name = "workout_id"),
            inverseJoinColumns = @JoinColumn(name = "exercise_id")
    )
    private List<Exercise> exercises;

//    @OneToMany(mappedBy = "workout")
//    private List<WorkoutSchedule> workoutSchedulers;
    
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public List<Exercise> getExercises() { return exercises; }
    public void setExercises(List<Exercise> exercises) { this.exercises = exercises; }
    
//    public List<WorkoutSchedule> getWorkoutSchedulers() { return workoutSchedulers; }
//    public void setWorkoutSchedulers(List<WorkoutSchedule> workoutSchedulers) { this.workoutSchedulers = workoutSchedulers; }
}
