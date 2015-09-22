package br.com.uri.repositories;

import br.com.uri.models.Todo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Startup
@Singleton
public class TodoRepository implements Serializable {
    private final List<Todo> todos = new ArrayList<>();
    
    public boolean add(Todo todo) {
        return todos.add(todo);
    }
    
    public boolean update(Todo todo) {
        todos.remove(todo);
        return todos.add(todo);
    }
    
    public List<Todo> list() {
        return todos;
    }
}