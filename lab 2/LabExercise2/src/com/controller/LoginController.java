package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Auth;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String role = Auth.authenticate(username , password);
		
		if(role.equals("invalid")) {
			response.sendRedirect("errorPage.jsp");
		}else {
			request.getSession().setAttribute("role", role);
			switch(role) {
			case "admin":
				response.sendRedirect("adminPage.jsp");
				break;
			case "coach":
				response.sendRedirect("coachPage.jsp");
				break;
			case "trainee":
				response.sendRedirect("trainee.jsp");
				break;
			}
		}

	}

}
