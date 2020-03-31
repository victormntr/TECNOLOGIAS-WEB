package br.com.projeto.empresa.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/Login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginController() {
        // TODO Auto-generated constructor stub
    	super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("email");
        String senha = request.getParameter("senha");
        			   request.getSession().setAttribute("email", login);
        
        System.out.println(login);
        System.out.println(senha);
        

        if(login.equals("victormntr268@gmail.com") && senha.equals("1234")) {
        	
        	response.sendRedirect("http://localhost:8080/agenda-acme/admin/dashboard/index.jsp");
        }
        else {
        	response.sendRedirect("Retorno.jsp");
        	System.out.println("Usuário ou senha inválidos...");
        	
        }

	}	
}
