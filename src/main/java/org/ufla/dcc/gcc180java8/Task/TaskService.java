package org.ufla.dcc.gcc180java8.Task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

  @Autowired
  private TaskRepository repository;

  public List<Task> getTasks() {
    return repository.findAll();
  }

  public Task createTask(Task newTask) {
    return repository.save(newTask);
  }
}