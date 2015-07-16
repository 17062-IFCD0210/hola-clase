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
	
			//3º recoger parametros del formulario 
			String pNombre = request.getParameter("nombre");
			String pApellido = request.getParameter("apellido");
		
			//crear Persona
			Persona p = new Persona();
			p.setNombre ( pNombre );//con la p indicamos que es un parametro
			p.setApellido ( pApellido );
		
			//guardamos en la BBDD
			
			//2º enviar atributo para mensaje
			request.setAttribute("msg", "Zorionak te has dado de alta");
			//enviar atributo persona (guardamos el atributo con el objeto de la persona)
			request.setAttribute("persona", p);
		
			//1º Ir a => personaDetalle.jsp;el dispatcher se encarga de mandarlo a otro sitio
			RequestDispatcher dispatcher = request.getRequestDispatcher("includes/persona/personaDetalle.jsp");//aqui hemos metido 'la bala',creamos la variable por delante
			//ahora 'disparamos'
			dispatcher.forward(request, response);
			
			
	}

}
