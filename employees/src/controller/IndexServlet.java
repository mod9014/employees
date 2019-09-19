package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EmployeesDAO;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/index")
public class IndexServlet extends HttpServlet {
	EmployeesDAO employeesDAO;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.employeesDAO = new EmployeesDAO();
		int rowCount = employeesDAO.getEmployeesCount();
		request.setAttribute("rowCount", rowCount);
		request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
	}

}
