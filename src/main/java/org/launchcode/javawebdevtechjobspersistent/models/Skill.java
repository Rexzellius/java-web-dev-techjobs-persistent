package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy="skill")
    private final List<Job> jobs = new ArrayList<>();

    @Size(min=1, max=250, message = "Description cannot be too small or too long.")
    @NotBlank
    private String description;

    @Valid
    public Skill() {

    }

    public Skill (String description, List<Job> jobs) {
        super();
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}
