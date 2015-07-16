package com.ipartek.formacion.holaclase.controladores;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.holaclase.poo.bean.Persona;
import com.ipartek.formacion.holaclase.poo.bean.PersonaException;

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
		//Recoger parametros del formulario
		String pNombre = request.getParameter("nombre");
		String pApellido = request.getParameter("apellido");
		String pEmail = request.getParameter("email");
		int pEdad = Integer.parseInt( request.getParameter("edad") );
		String pAprobado = request.getParameter("aprobado");
		int pNota = Integer.parseInt( request.getParameter("nota") );
		
		//Validar los datos
		
		//Crear Persona
		Persona p = new Persona();
		p.setNombre(pNombre);
		p.setApellido(pApellido);
		p.setEmail(pEmail);
		try {
			p.setEdad(pEdad);
		} catch (PersonaException e) {
			
			e.printStackTrace();
		}
		p.setNota(pNota);
		
		//Guardar en la BBDD
		
		//Enviar atributo para mensaje
		request.setAttribute("msg", "Zorionak te has dado de alta");
		// Enviar atributo Persona
		request.setAttribute("persona", p);
		
		
		//Ir a => personaDetalle.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("includes/persona/personaDetalle.jsp");
		dispatcher.forward(request, response);
	}

}
