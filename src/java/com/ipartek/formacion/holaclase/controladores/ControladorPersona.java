package com.ipartek.formacion.holaclase.controladores;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.holaclase.poo.bean.Persona;

/**
 * Servlet implementation class ControladorPersona
 */
public class ControladorPersona extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorPersona() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//recoger parametros del formulario
		String pNombre = request.getParameter("nombre");
		
		
		//validar los datos
		
		//crear Persona
		Persona p = new Persona();
		p.setNombre( pNombre );
		
		//guardamos en la BBDD
		
		
		//enviar attributo para mensaje
		request.setAttribute("msg", "Zorionak te has dado de alta");
		//enviar attributo Persona
		request.setAttribute("persona", p );
		
		
		
		//Ir a => personaDetalle.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("includes/persona/personaDetalle.jsp");
		dispatcher.forward(request, response );
				
		
	}

}
