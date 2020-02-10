package com.workitout.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.workitout.util.ByteDeserializeConventer;
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
public class Media implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private int index;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "exercise_id")
    @Getter
    @Setter
    private Exercise exercise;
    
    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String url;
    
    @JsonDeserialize(converter = ByteDeserializeConventer.class)
    @Getter
    @Setter
    private byte[] source;

    public void withExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public void updateBy(Media media) {
        index = media.index;
        source = media.source;
        url = media.url;
    }
}
