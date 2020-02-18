package com.workitout.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Aintech
 */

@Entity
@Table
public class Exercise implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String name;

    @Enumerated(EnumType.STRING)
    @Getter
    @Setter
    private ExerciseType type;

    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = MuscleGroup.class)
    @Getter
    @Setter
    private List<MuscleGroup> muscleGroups;

    @Getter
    @Setter
    private String externalLink;

    @Getter
    @Setter
    @Column(length = 2048)
    private String instruction;

    /** Weight in gramms */
    @Getter
    @Setter
    private Long weight;

    @Getter
    @Setter
    private Long recovery;
    
    @JsonIgnore
    @ManyToMany(mappedBy = "exercises")
    @Getter
    @Setter
    private List<Workout> workouts;
    
    @OneToMany(mappedBy = "exercise")
    @Setter
    private List<Round> rounds;

    @OneToMany(mappedBy = "exercise")
    @Setter
    private List<Media> medias;

    public List<Round> getRounds() {
        return rounds;
    }

    public List<Media> getMedias() {
        return medias;
    }

    public void updateBy(Exercise exercise) {
        instruction = exercise.instruction;
        name = exercise.name;
        externalLink = exercise.externalLink;
        recovery = exercise.recovery;
        weight = exercise.weight;
        type = exercise.type;
    }
}
