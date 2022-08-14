package org.ufla.dcc.gcc180java8.Task;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Component
public class Task {
  @Id
  public String id;
  public String description;
  public String deadline;
  public Boolean done;

  public Task(String description, String deadline) {
    this.description = description;
    this.deadline = deadline;
  }

  public Task() {
    this.description = "";
    this.deadline = "";
  }

  @Override
  public String toString() {
    return "Task [deadline=" + deadline + ", description=" + description + ", done=" + done + ", id=" + id + "]";
  }

}
