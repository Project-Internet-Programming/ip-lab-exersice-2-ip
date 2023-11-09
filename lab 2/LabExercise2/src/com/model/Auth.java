package com.model;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Auth
 */
@WebServlet("/Auth")
public class Auth extends HttpServlet {
	private static final String ADMIN_USERNAME = "admin";
	private static final String ADMIN_PASSWORD = "admin";
	private static final String COACH_USERNAME = "user1";
	private static final String COACH_PASSWORDS = "user1";
	private static final String TRAINEE_USERNAME = "user2";
	private static final String TRAINEE_PASSWORD = "user2";

	public static String authenticate(String username,String password) {
		if(username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
			return "admin";
		}else if(username.equals(COACH_USERNAME) && password.equals(COACH_PASSWORDS)) {
			return "coach";
		}else if(username.equals(TRAINEE_USERNAME) && password.equals(TRAINEE_PASSWORD)) {
			return "trainee";
		}else {
			return "invalid";
		}
	}
	
}