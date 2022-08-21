package org.ufla.dcc.gcc180java8.Task;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class TaskController {

  @Autowired
  private TaskService service;

  @GetMapping("/tasks")
  public List<Task> getTasks() {
    return service.getTasks();
  }

  @PostMapping("/tasks")
  public Task createTask(@RequestBody Task newTask) {
    return service.createTask(newTask);
  }

  @DeleteMapping("/tasks/{id}")
  public void deleteTask(@PathVariable String id) {
    service.deleteTask(id);
  }

  @GetMapping("/tasks/{id}") 
  public Optional<Task> getTask (@PathVariable String id) {
    return service.getTask(id);
  }

  @PutMapping ("/tasks")
  public Task updateTask (@RequestBody Task task) {
    return service.updateTask(task);
  }

}

