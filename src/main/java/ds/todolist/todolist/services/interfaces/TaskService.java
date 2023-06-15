package ds.todolist.todolist.services.interfaces;

import java.util.List;

import ds.todolist.todolist.model.Task;

public interface TaskService {
    List<Task> getAllTasks();
    void saveTask(Task task);
    Task getTaskById(long id);
    void deleteTaskById(long id);
}
