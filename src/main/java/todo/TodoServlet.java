package todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/todo.do")
@SuppressWarnings("serial")
public class TodoServlet extends HttpServlet {

	AddTodos todobj=new AddTodos();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		request.setAttribute("todos", todobj.retriveTodos());
		request.getRequestDispatcher("/WEB-INF/views/Todo.jsp").forward(request, response);

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	String newtodo=request.getParameter("todo");
	if(newtodo!="") {
		todobj.addTodo(new Todo(newtodo));
	}
	
	response.sendRedirect("/todo.do");
	
	}	
}