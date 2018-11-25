package com.workitout.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
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
@Table(name = "_workout_schedule")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class WorkoutSchedule implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "_id")
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "_workout_id")
    private Workout workout;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "_date")
    private Date date;
    
    @Column(name = "_performed")
    private boolean performed;

    @OneToMany(mappedBy = "workoutSchedule")
    private List<WorkoutHistory> workoutHistories;
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Workout getWorkout() { return workout; }
    public void setWorkout(Workout workout) { this.workout = workout; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public boolean isPerformed() { return performed; }
    public void setPerformed(boolean performed) { this.performed = performed; }

    public List<WorkoutHistory> getWorkoutHistories() { return workoutHistories; }
    public void setWorkoutHistories(List<WorkoutHistory> workoutHistories) { this.workoutHistories = workoutHistories; }
}