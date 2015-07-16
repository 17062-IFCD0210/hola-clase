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
		String pNombre = request.getParameter("nombre"); //es el name del input
		String pApellido = request.getParameter("apellido");
		String pEmail = request.getParameter("email");
		int pEdad = Integer.parseInt(request.getParameter("edad"));
		boolean pAprobado = false;
		pAprobado="si".equals((request.getParameter("aprobado")));
		int pNota = Integer.parseInt(request.getParameter("nota"));
		
		//validar los datos
		
		//crear Persona
		Persona p = new Persona();
		p.setNombre(pNombre);
		p.setApellido(pApellido);
		try{
			p.setEdad(pEdad);
		}catch(Exception e){
			//hay un problema con la edad
		}
		p.setEmail(pEmail);
		p.setNota(pNota);
		p.setAprobado(pAprobado);
		
		
		//guardar Persona en la BBDD
		
		
		// enviar atributo para mensaje
		request.setAttribute("msg", "Zorionak te has dado de alta"); 
		//msg es la key y Zorionak... el value

		//enviar atributo Persona
		request.setAttribute("persona", p);
		
		//Ir a => personaDetalle.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("includes/persona/personaDetalle.jsp");
		dispatcher.forward(request, response);
		
	}

}
