package in.cdac;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ModalDemoServlet
 */
@WebServlet("/modal-demo")
public class ModalDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// NUMBER
		int id = 100;

		// Collection of Number
		ArrayList<Integer> idList = new ArrayList<>();
		idList.add(101);
		idList.add(102);

		String cityName = "juhu";
		ArrayList<String> cityList = new ArrayList<String>();
		cityList.add("bandra");
		cityList.add("khar");
		cityList.add("andheri");

		// USER DEFIND DATA TYPE
		User user = new User();
		user.setId(1);
		user.setName("CDAC");
		
		ArrayList<User> userLIst = new ArrayList<>();
		for(int i=0; i<5; i++) {
			User user1 = new User();
			user1.setId(1);
			user1.setName("CDAC " + i);
			
			userLIst.add(user1);
		}
		

		// SHARING PUT ON SCOPE
		request.setAttribute("ID", id);
		request.setAttribute("ID_LIST", idList);

		request.setAttribute("CITY_NAME", cityName);
		request.setAttribute("CITY_LIST", cityList);
		
		
		request.setAttribute("USER", user);
		request.setAttribute("USER_LIST", userLIst);
		

		request.getRequestDispatcher("/modaldemo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
