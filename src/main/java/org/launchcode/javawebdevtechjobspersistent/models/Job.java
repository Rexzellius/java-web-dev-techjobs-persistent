package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity {

    @ManyToOne
    private Employer employer;


    @ManyToMany
    private List<Skill> skill = new ArrayList<>();

    public Job() {
    }

    public Job(@NotBlank(message = "Field cannot be blank") Employer anEmployer, @NotBlank(message = "Field cannot be blank") List<Skill> someSkills) {
        super();
        this.employer = anEmployer;
        this.skill = someSkills;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skill;
    }

    public void setSkills(List<Skill> skill) {
        this.skill = skill;
    }

    public void addSkill(Skill newSkill) {
        this.skill.add(newSkill);
    }
}