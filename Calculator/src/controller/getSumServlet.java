package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Sum;

//Cassandra Wruck

/**
 * Servlet implementation class getSumServlet
 */
@WebServlet("/getSumServlet")
public class getSumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getSumServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String num1 = request.getParameter("userNumber1");
		String num2 = request.getParameter("userNumber2");
		String num3 = request.getParameter("userNumber3");
		String num4 = request.getParameter("userNumber4");
		
		
		Sum userSum = new Sum(Integer.parseInt(num1), Integer.parseInt(num2), Integer.parseInt(num3), Integer.parseInt(num4));
		
		request.setAttribute("userCompleteSum", userSum);
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
