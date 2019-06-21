package io.agileintelligence.demo.service;

import io.agileintelligence.demo.domain.ProjectTask;
import io.agileintelligence.demo.repository.ProjectTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectTaskService {

    @Autowired
    private ProjectTaskRepository projectTaskRepository;

    public ProjectTask saveOrUpdateProjectTask(ProjectTask projectTask){

        if(projectTask)
        {}

        return projectTaskRepository.save(projectTask);
    }


}


// Middleman between Controller and Repository