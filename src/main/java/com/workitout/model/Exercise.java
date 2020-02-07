package com.workitout.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Aintech
 */

@Entity
@Table
public class Exercise implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;
    
    @Column
    private Integer index;
    
    @Column
    private String name;

    @Enumerated(EnumType.STRING)
    @Column
    private ExerciseType type;

    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = MuscleGroup.class)
    @Column
    private List<MuscleGroup> muscleGroups;

    @Column
    private String externalLink;
    
    @Column
    private String instruction;

    /** Weight in gramms */
    @Column
    private int weight;
    
    @Column
    private Integer timeout;
    
    @JsonIgnore
    @ManyToMany(mappedBy = "exercises")
    private List<Workout> workouts;
    
    @OneToMany(mappedBy = "exercise")
    private List<Round> rounds;

    @OneToMany(mappedBy = "exercise")
    private List<Media> medias;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Integer getIndex() { return index; }
    public void setIndex(Integer index) { this.index = index; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public ExerciseType getType() { return type; }
    public void setType(ExerciseType type) { this.type = type; }

    public String getExternalLink() { return externalLink; }
    public void setExternalLink(String externalLink) { this.externalLink = externalLink; }

    public String getInstruction() { return instruction; }
    public void setInstruction(String instruction) { this.instruction = instruction; }

    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }
    
    public Integer getTimeout() { return timeout; }
    public void setTimeout(Integer timeout) { this.timeout = timeout; }

    public List<Workout> getWorkouts() {
        return workouts;
    }
    public void setWorkouts(List<Workout> workouts) {
        this.workouts = workouts;
    }

    public List<Round> getRounds() { return rounds; }
    public void setRounds(List<Round> rounds) { this.rounds = rounds;}

    public List<Media> getMedias() { return medias; }
    public void setMedias(List<Media> medias) { this.medias = medias; }

    public void updateBy(Exercise exercise) {
        setIndex(exercise.getIndex());
        setInstruction(exercise.getInstruction());
        setName(exercise.getName());
        setExternalLink(exercise.getExternalLink());
        setTimeout(exercise.getTimeout());
        setWeight(exercise.getWeight());
        setType(exercise.getType());
    }
}
