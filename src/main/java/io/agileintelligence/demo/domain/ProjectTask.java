package io.agileintelligence.demo.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class ProjectTask {

    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long Id;

    @NotBlank(message = "Summary cannot be blank")
    private String summary;
    private String status;
    private String  acceptanceCriteria;

    public ProjectTask(){

    }

    public Long getById() {
        return Id;
    }

    public void setById(Long id) {
        Id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAcceptanceCriteria() {
        return acceptanceCriteria;
    }

    public void setAcceptanceCriteria(String acceptanceCriteria) {
        this.acceptanceCriteria = acceptanceCriteria;
    }
}


