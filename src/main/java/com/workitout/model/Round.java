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
public class Round implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer id;

    @Getter
    @Setter
    private Integer index;

    @Getter
    @Setter
    private Integer repeat;

    @Getter
    @Setter
    private Integer recovery;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "exercise_id")
    @Getter
    @Setter
    private Exercise exercise;

    public void withExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public void updateBy(Round round) {
        index = round.index;
        repeat = round.repeat;
        recovery = round.recovery;
    }
}
