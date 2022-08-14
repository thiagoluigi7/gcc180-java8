package org.ufla.dcc.gcc180java8.Task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class TaskController {

  @Autowired
  private TaskService service;

  @GetMapping("/task")
  public List<Task> getTasks() {
    return service.getTasks();
  }

  @PostMapping("/task")
  public Task createTask(@RequestBody Task newTask) {
    return service.createTask(newTask);
  }
}
