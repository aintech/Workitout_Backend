package com.workitout.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
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
@Table(name = "_workout_history")
public class WorkoutHistory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "_id")
    private int id;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "_workout_schedule_id")
    private WorkoutSchedule workoutSchedule;
    
    @Column(name = "_name")
    private String name;
    
    @Column(name = "_index")
    private int index;
    
    @Column(name = "_weight")
    private int weight;
    
    @Column(name = "_repeats_done")
    private String repeats;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public WorkoutSchedule getWorkoutSchedule() { return workoutSchedule; }
    public void setWorkoutSchedule(WorkoutSchedule workoutSchedule) { this.workoutSchedule = workoutSchedule; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getIndex() { return index; }
    public void setIndex(int index) { this.index = index; }

    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }

    public String getRepeats() { return repeats; }
    public void setRepeats(String repeats) { this.repeats = repeats; }
}
