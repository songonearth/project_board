package io.agileintelligence.demo.service;

import io.agileintelligence.demo.domain.ProjectTask;
import io.agileintelligence.demo.repository.ProjectTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProjectTaskService {

    @Autowired
    private ProjectTaskRepository projectTaskRepository;

    public ProjectTask saveOrUpdateProjectTask(ProjectTask projectTask){

        if(projectTask.getStatus()==null || projectTask.getStatus()=="") {
            projectTask.setStatus("TO_DO");
        }

        return projectTaskRepository.save(projectTask);
    }

    public Iterable<ProjectTask> findAll(){
        return projectTaskRepository.findAll();
    }

    public Optional<ProjectTask> findById(Long id){
        return projectTaskRepository.findById(id);
    }


    public void deleteTask(Long id){
        Optional<ProjectTask> projectTask = findById(id);
        projectTaskRepository.delete(projectTask.get());

    }
}


// Middleman between Controller and Repository