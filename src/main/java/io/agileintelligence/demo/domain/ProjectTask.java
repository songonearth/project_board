package io.agileintelligence.demo.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
public class ProjectTask {

    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long Id;

    @NotBlank(message = "Summary cannot be blank")
    private String summary;
    private String status;
    private String  acceptanceCriteria;

    public ProjectTask(String summary, String status, String acceptanceCriteria){
        this.summary = summary;
        this.status = status;
        this.acceptanceCriteria = acceptanceCriteria;
    }



}


