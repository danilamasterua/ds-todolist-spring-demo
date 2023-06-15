package ds.todolist.todolist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ds.todolist.todolist.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{
    
}
