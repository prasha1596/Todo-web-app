package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import todo.AddTodos;
import todo.UserValidation;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		try {
			request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	UserValidation user=new UserValidation();
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
			
		PrintWriter out= response.getWriter();
		out.print("Welcome from servlet");
		try {
			
			String name=request.getParameter("name");
			String password=request.getParameter("password");
			
			if(user.isUserValid(name, password)) {
			request.getSession().setAttribute("name", name);
			response.sendRedirect("/todo.do");	
			}
			else {
				request.setAttribute("errorMessage", "Invalid Credentials!!");
				request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
			}
				
		} catch (ServletException e) {
			out.print("The page does not exists");
			e.printStackTrace();
		}
	}
}