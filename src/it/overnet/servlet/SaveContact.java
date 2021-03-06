package it.overnet.servlet;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.overnet.dao.ContactDao;
import it.overnet.models.Contact;

@WebServlet("/SaveContact")
public class SaveContact extends HttpServlet {

	private static final Logger logger = Logger.getLogger(SaveContact.class.getName());

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("add.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String tel = request.getParameter("tel");
		String mail = request.getParameter("mail");
		

		Contact contact = new Contact();
		contact.setNome(nome);
		contact.setCognome(cognome);
		contact.setTel(tel);
		contact.setMail(mail);

		try {
			ContactDao.saveContact(contact);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		logger.info(nome);

		response.sendRedirect("List");
	}

}
