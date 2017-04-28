package it.overnet.servlet;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.overnet.dao.CRUD;

@WebServlet("/Login")
public class Login extends HttpServlet {

	private static final Logger logger = Logger.getLogger(Login.class.getName());
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			HttpSession session = request.getSession();

			if (username.equals("user") && password.equals("pass")) {
				CRUD.createTable();
				session.setAttribute("logged", true);
				response.sendRedirect("List");
				logger.info("Accesso consentito " + username);
			} else {
				logger.warning("Accesso negato");
				response.sendRedirect("Login");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
