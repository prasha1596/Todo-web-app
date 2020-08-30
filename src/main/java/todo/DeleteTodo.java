package todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet(urlPatterns="/delete-todo.do")
public class DeleteTodo extends HttpServlet {
	AddTodos obj=new AddTodos();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	
		obj.deleteTodo(request.getParameter("todo"));
		response.sendRedirect("/todo.do");
	}
}
