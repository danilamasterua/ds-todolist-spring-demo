package ds.todolist.todolist.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ds.todolist.todolist.model.Task;
import ds.todolist.todolist.repositories.TaskRepository;
import ds.todolist.todolist.services.interfaces.TaskService;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public void saveTask(Task task) {
        this.taskRepository.save(task);
    }

    @Override
    public Task getTaskById(long id) {
        Optional<Task> optional = taskRepository.findById(id);
        Task task = null;
        if(optional.isPresent()){
            task = optional.get();
        } else{
            throw new RuntimeException("Task not found by id = " + id);
        }
        return task;
    }

    @Override
    public void deleteTaskById(long id) {
        this.taskRepository.deleteById(id);
    }

    @Override
    public List<Task> getAllTasks() {
       return this.taskRepository.findAll();
    }
    
}
