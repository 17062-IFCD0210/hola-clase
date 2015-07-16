package com.ipartek.formacion.holaclase.controladores;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.holaclase.poo.bean.Persona;
import com.ipartek.formacion.holaclase.poo.ejemplos.PersonaException;

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
		
		//recoger paametros del formulario
		String pNombre = request.getParameter("nombre");
		String pApellido = request.getParameter("apellido");
		String pEmail = request.getParameter("email");
		int pEdad = 0 ;
		
		
		if("".equals(request.getParameter("edad"))){
		}else{
			pEdad = Integer.parseInt(request.getParameter("edad"));
		}
//		boolean pAprobado = Boolean.parseBoolean(request.getParameter("aprobado"));
//		int pNota = Integer.parseInt(request.getParameter("nota"));
		
		

		
		//validar los datos
		
		//crear Persona
		Persona p = new Persona();
		p.setNombre(pNombre);
		p.setApellido(pApellido);
		p.setEmail(pEmail);
		try {
			p.setEdad(pEdad);
		} catch (PersonaException e) {
			request.setAttribute("msg", "No se a podido dar de alta la Persona: " + e.getMessage());
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("includes/persona/personaFormulario.jsp");
			dispatcher.forward(request, response);
			e.printStackTrace();
		}
//		p.setAprobado(pAprobado);
//		p.setNota(pNota);
		
		
		//guardar en la BBDD
		
		
		
		//enviar atributo para mensaje
		request.setAttribute("msg", "Zorionak " + pNombre +", te has dado de alta");
		//enviar atributo para Persona
		request.setAttribute("persona", p);
		
		//Ir a => personaDetalle.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("includes/persona/personaDetalle.jsp");
		dispatcher.forward(request, response);
			
	}

}
