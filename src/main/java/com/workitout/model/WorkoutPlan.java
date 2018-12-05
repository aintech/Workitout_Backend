package com.workitout.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Aintech
 */
@Entity
@Table(name = "_workout_plan")
public class WorkoutPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "_id")
    private int id;
    
    @Column(name = "_name")
    private String name;
    
    @Column(name = "_index")
    private int index;
    
    @OneToMany(mappedBy = "workoutPlan")
    private List<WorkoutToPlanBinding> bindings;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getIndex() { return index; }
    public void setIndex(int index) { this.index = index; }

    public List<WorkoutToPlanBinding> getBindings() { return bindings; }
    public void setBindings(List<WorkoutToPlanBinding> bindings) { this.bindings = bindings; }
}