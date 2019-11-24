package in.cdac;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/hello-servlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		// out.println("<div>hell world!!!</div>");
		
		String message = "Hello JSP !!!";
		
		List<String> list = new ArrayList<>();
		list.add("BANDRA");
		list.add("MAHIM");
		
		User user = new User();
		user.setEmail("hello@gmail.com");
		user.setUsername("KHARRRR");
		
		
		request.setAttribute("user", user);
		request.setAttribute("message", message);
		request.setAttribute("list", list);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/hello.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
