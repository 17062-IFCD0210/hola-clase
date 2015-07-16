package com.ipartek.formacion.holaclase.controladores;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.holaclase.poo.bean.Persona;
import com.ipartek.formacion.holaclase.poo.excepciones.PersonaException;

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
		// TODO Auto-generated method stub
		Persona persona = new Persona();
		
		//recoger parametros del formulario
		
		
		String pNombre = request.getParameter("nombre");
		String pApellidos=request.getParameter("apellidos");
		int pEdad=Integer.parseInt(request.getParameter("edad"));
		String pEmail = request.getParameter("email");
		int pNota = Integer.parseInt(request.getParameter("nota"));
		String pAprobadoAux = request.getParameter("aprobado");
		Boolean pAprobado;
		if (pAprobadoAux!=null){
			pAprobado = true;	
		}else{
			pAprobado = false;
		}
		
		
		//validar los datos
		
		
		//crear Persona
		
		persona.setNombre(pNombre);
		persona.setApellidos(pApellidos);
		try {
			persona.setEdad(pEdad);
		} catch (PersonaException e) {
			request.setAttribute("error", e.getMessage());
			RequestDispatcher dispatcher = request.getRequestDispatcher("includes/persona/persona_form.jsp");
			dispatcher.forward(request, response);
			e.printStackTrace();
		}
		persona.setEmail(pEmail);
		persona.setNota(pNota);
		persona.setAprobado(pAprobado);
		
		//guardar en BBDD
		
		//enviar attributo para mensaje
		
		request.setAttribute("msg", "Zorionak, la persona se ha creado");
		request.setAttribute("persona", persona);
		
		//ir a => personaDetalle.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("includes/persona/persona_detalle.jsp");
		dispatcher.forward(request, response);
		
	}

}
