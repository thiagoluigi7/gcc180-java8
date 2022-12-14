package org.ufla.dcc.gcc180java8.Task;

import java.util.List;
import java.util.Optional;

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

  public Optional<Task> getTask (String id) {
    return repository.findById(id);
  }

  public void deleteTask (String id) {
    repository.deleteById(id);

  }

  public Task updateTask (Task task) {
    return repository.save(task);
  }

}