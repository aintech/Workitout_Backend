package com.workitout.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.io.Serializable;
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

/**
 *
 * @author Aintech
 */

@Entity
@Table(name = "_exercise")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Exercise implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "_id")
    private Integer id;
    
    @Column(name = "_index")
    private Integer index;
    
    @Column(name = "_name")
    private String name;
    
    @Column(name = "_instruction")
    private String instruction;
    
    @Column(name = "_weight")
    private String weight;
    
    @Column(name = "_timeout")
    private Integer timeout;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "_workout_id")
    private Workout workout;
    
    @OneToMany(mappedBy = "exercise")
    private List<Round> rounds;
    
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Integer getIndex() { return index; }
    public void setIndex(Integer index) { this.index = index; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getInstruction() { return instruction; }
    public void setInstruction(String instruction) { this.instruction = instruction; }

    public String getWeight() { return weight; }
    public void setWeight(String weight) { this.weight = weight; }
    
    public Integer getTimeout() { return timeout; }
    public void setTimeout(Integer timeout) { this.timeout = timeout; }

    public Workout getWorkout() { return workout; }
    public void setWorkout(Workout workout) { this.workout = workout; }

    public List<Round> getRounds() { return rounds; }
    public void setRounds(List<Round> rounds) { this.rounds = rounds;}
}