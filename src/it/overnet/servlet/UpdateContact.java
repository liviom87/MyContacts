package it.overnet.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.overnet.dao.ContactDao;
import it.overnet.models.Contact;

@WebServlet("/Update")
public class UpdateContact extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	int contactId ;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		contactId = Integer.parseInt (request.getParameter("id"));
		
		Contact contact = ContactDao.getContactById(contactId);		
		System.out.println(contact);
		
		request.setAttribute("contact", contact);
		request.getRequestDispatcher("edit.jsp").forward(request, response);
		
		
		
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String tel = request.getParameter("tel");
		String mail = request.getParameter("mail");
		

		Contact contact = new Contact();
		contact.setId(contactId);
		contact.setNome(nome);
		contact.setCognome(cognome);
		contact.setTel(tel);
		contact.setMail(mail);

		try {
			ContactDao.editContact(contact);
			response.sendRedirect("List");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}

}
