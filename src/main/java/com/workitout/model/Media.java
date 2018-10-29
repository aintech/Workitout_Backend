package com.workitout.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
@Table(name = "_media")
public class Media implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "_id")
    private int id;
    
    @Column(name = "_index")
    private int index;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "_exercise_id")
    private Exercise exercise;
    
    @Column(name = "_name")
    private String name;
    
    @Column(name = "_url")
    private String url;
    
    @JsonDeserialize(converter = ByteDeserializeConventer.class)
    @Column(name = "_source")
    private byte[] source;
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getIndex() { return index; }
    public void setIndex(int index) { this.index = index; }

    public Exercise getExercise() { return exercise; }
    public void setExercise(Exercise exercise) { this.exercise = exercise; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }

    public byte[] getSource() { return source; }
    public void setSource(byte[] source) { this.source = source; }
}