package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @NotNull
    @Size(min = 2, max = 250, message = "Description cannot be too short or too long.")
    private String description;

    @ManyToMany(mappedBy = "skill")
    private final List<Job> jobs = new ArrayList<>();

    // constructors

    public Skill() {
    }

    public Skill(String description) {
        super();
        this.description = description;
    }

    // getters and setters


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void addJob(Job newJob) {
        this.jobs.add(newJob);
    }
}
