package todo;

import java.util.ArrayList;
import java.util.List;

public class AddTodos {
	private static List<Todo> todos = new ArrayList<>();
	
	static {
		todos.add(new Todo("Learn Sring Framework"));
		todos.add(new Todo("Learn DSA"));
		todos.add(new Todo("Learn Python"));
	}
	
	public List<Todo> retriveTodos() {
		return todos;
	}
	
	public void addTodo(Todo todo) {
		todos.add(todo);
	}
	
	public void deleteTodo(String todo) {
		todos.remove(new Todo(todo));
	}
}
