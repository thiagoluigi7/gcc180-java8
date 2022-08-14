package org.ufla.dcc.gcc180java8.Task;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends MongoRepository<Task, String> {
  public Task findByDeadline(String deadline);
}