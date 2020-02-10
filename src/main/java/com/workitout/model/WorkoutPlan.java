package com.workitout.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
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
@Table
public class WorkoutPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private int index;

    @Getter
    @Setter
    private boolean scheduled;
    
    @OneToMany(mappedBy = "workoutPlan")
    @Getter
    @Setter
    private List<WorkoutToPlanBinding> bindings;

    public void updateBy(WorkoutPlan workoutPlan) {
        index = workoutPlan.index;
        name = workoutPlan.name;
        scheduled = workoutPlan.scheduled;
    }
}
