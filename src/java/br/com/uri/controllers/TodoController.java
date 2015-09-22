package br.com.uri.controllers;

import br.com.uri.models.Todo;
import br.com.uri.repositories.TodoRepository;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

@ManagedBean
@RequestScoped
public class TodoController {
    @Inject
    private TodoRepository todoRepository;
    private Todo todo = new Todo();
    private List<Todo> todos;
    
    @PostConstruct
    public void load() {
        this.todos = todoRepository.list();
    }
    
    public Todo getTodo() {
        return todo;
    }

    public void setTodo(Todo todo) {
        this.todo = todo;
    }

    public List<Todo> getTodos() {
        return todos;
    }

    public void setTodos(List<Todo> todos) {
        this.todos = todos;
    }
    
    public String newTodo() {
        return "newTodo";
    }
    
    public String save() {
        todoRepository.add(todo);
        return "todos";
    }
    
    public void done(Todo todo) {
        todo.setDone(true);
        todoRepository.update(todo);
    }
        
}