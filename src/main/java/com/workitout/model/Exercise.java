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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Aintech
 */

@Entity
@Table(name = "_exercise")
public class Exercise implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "_id")
    private Integer id;
    
    @Column(name = "_index")
    private Integer index;
    
    @Column(name = "_name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "_type")
    private ExerciseType type;

    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = MuscleGroup.class)
    @Column(name = "_muscle_groups")
    private List<MuscleGroup> muscleGroups;

    @Column(name = "_external_link")
    private String externalLink;
    
    @Column(name = "_instruction")
    private String instruction;
    
    //Weight int gramms
    @Column(name = "_weight")
    private int weight;
    
    @Column(name = "_timeout")
    private Integer timeout;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "_workout_id")
    private Workout workout;
    
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

    public Workout getWorkout() { return workout; }
    public void setWorkout(Workout workout) { this.workout = workout; }

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
