package it.overnet.servlet;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {

	private static final Logger logger = Logger.getLogger(Login.class.getName());
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (username.equals("user") && password.equals("pass")) {
			response.sendRedirect("list.jsp");

			logger.info("Accesso consentito" + username);
		} else {
			response.sendRedirect("login.jsp");
			logger.warning("Accesso negato");
		}
	}

}
