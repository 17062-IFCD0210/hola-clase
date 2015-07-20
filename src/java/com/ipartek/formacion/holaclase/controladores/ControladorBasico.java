package com.ipartek.formacion.holaclase.controladores;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControladorBasico
 */

public class ControladorBasico extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static int num;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorBasico() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pTexto = (String)request.getParameter("texto");
		String pNumero = (String)request.getParameter("numero");
		
		num = Integer.parseInt(pNumero);
		
		for(int i=0; i<num; i++) {
			request.setAttribute("num"+i, pTexto);
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("ejemplos/formularios/ejemploFormBasico.jsp");
		dispatcher.forward(request, response);
	}

}
