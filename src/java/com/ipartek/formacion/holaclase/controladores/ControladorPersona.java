package com.ipartek.formacion.holaclase.controladores;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.holaclase.poo.bean.Persona;
import com.ipartek.formacion.holaclase.poo.ejemplos.ExcepcionPersona;

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
		
		//Recoger parametros del formulario
		String pNombre = request.getParameter("nombre");
		String pApellido = request.getParameter("apellido");
		String pEdad = request.getParameter("edad");
		String pEmail = request.getParameter("mail");
		String pAprobado = request.getParameter("aprobado");
		String pNota = request.getParameter("nota");
		
		//Validar los datos
		
		//Crear Persona
		Persona p = new Persona();
		p.setNombre(pNombre);
		p.setApellido(pApellido);
		try {
			p.setEdad(Integer.parseInt(pEdad));
		} catch (ExcepcionPersona e) {
			request.setAttribute("msg", e.getMessage());
			RequestDispatcher atras = request.getRequestDispatcher("includes/persona/personaForm.jsp");
			atras.forward(request, response);
		}
		p.setEmail(pEmail);
		p.setAprobado(Boolean.parseBoolean(pAprobado));
		p.setNota(Long.parseLong(pNota));
		
		//Guardamos en la BBDD
		
		
		//Enviar atributo para mensaje
		request.setAttribute("msg", "Zorionak, te has dado de alta");
		
		//Enviar atributo persona
		request.setAttribute("persona", p);
		
		
		
		//Ir a => personaDetalle.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("includes/persona/personaDetalle.jsp");
		dispatcher.forward(request, response);
	}

}
