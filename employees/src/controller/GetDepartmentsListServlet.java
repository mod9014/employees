package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DepartmentsDAO;
import vo.Departments;

/**
 * Servlet implementation class GetDepartmentsListServlet
 */
@WebServlet("/departments/getDepartmentsList")
public class GetDepartmentsListServlet extends HttpServlet {
	private DepartmentsDAO departmentsDAO;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.departmentsDAO = new DepartmentsDAO();
		List<Departments> list = departmentsDAO.selectDepartmentsList();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/WEB-INF/views/departments/getDepartmentsList.jsp").forward(request, response);
		
	}

}
