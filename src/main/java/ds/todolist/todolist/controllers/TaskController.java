package ds.todolist.todolist.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ds.todolist.todolist.model.Task;
import ds.todolist.todolist.services.interfaces.TaskService;

@Controller
public class TaskController {
    
    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("tasks", taskService.getAllTasks());
        return "index";
    }

    @GetMapping("/showNewTaskForm")
    public String showNewTaskForm(Model model){
        Task task = new Task();
        model.addAttribute("task", task);
        return "new_task";
    }

    @PostMapping("/saveTask")
    public String saveTask(@ModelAttribute("task") Task task){
        taskService.saveTask(task);
        return "redirect:/";
    }

    @PostMapping("/deleteTask/{id}")
    public String deleteTask(@PathVariable(value = "id") long id){
        taskService.deleteTaskById(id);
        return "redirect:/";
    }
}
