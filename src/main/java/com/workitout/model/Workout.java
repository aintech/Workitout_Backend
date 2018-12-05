package com.workitout.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Yaremchuk E.N. (aka Aintech)
 */

@Entity
@Table(name = "_workout")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Workout implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "_id")
    private Integer id;
    
    @Column(name = "_name")
    private String name;
    
    @OneToMany(mappedBy = "workout")
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
