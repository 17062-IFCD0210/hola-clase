package com.ipartek.formacion.holaclase.controladores;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.holaclase.poo.bean.Persona;
import com.ipartek.formacion.holaclase.poo.bean.PersonaException;
import com.ipartek.formacion.holaclase.util.Utilidades;

/**
 * Servlet implementation class ControladorPersona
 */
public class ControladorPersona extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	RequestDispatcher dispatcher;
	
	String pNombre;
	String pApellido;
	String pEmail;
	int pEdad;
	boolean pAprobado = false;
	float pNota;
	
       
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
		
		try{
			//recoger parametros del formulario
			getParameters(request);
					
			//validar los datos
			
			//crear Persona
			Persona p = new Persona();
			p.setNombre(pNombre);
			p.setApellido(pApellido);
			p.setEmail(pEmail);			
			p.setEdad(pEdad);
			
			//TODO cambiar Persona por Alumno
			//p.setAprobado(pAprobado)
			//p.setNota(pNota)
			
			//guardamos en la BBDD		
			
			//enviar attributo para mensaje
			request.setAttribute("msg", "Zorionak" + pNombre + "te has dado de alta");
			//enviar attributo Persona
			request.setAttribute("persona", p );
			

			
			//Ir a => personaDetalle.jsp
			dispatcher = request.getRequestDispatcher("includes/persona/personaDetalle.jsp");
		
		}catch ( PersonaException e){
			e.printStackTrace();
			request.setAttribute("msg", "No se a podido dar de alta la Persona: " + e.getMessage());
			dispatcher = request.getRequestDispatcher("includes/persona/personaFormulario.jsp");
			
		}catch( Exception e ){
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage() );
			dispatcher = request.getRequestDispatcher("plantillas/error.jsp");
			
		}finally{
			//despachar
			dispatcher.forward(request, response );			
		}
	}
	/**
	 * Recoger los parametros enviados
	 * @param request
	 * @throws PersonaException 
	 */
	private void getParameters(HttpServletRequest request) throws PersonaException {
		pNombre = request.getParameter("nombre");
		pApellido = request.getParameter("apellido");
		pEmail = request.getParameter("apellido");
		
		if(Utilidades.isNumeric(request.getParameter("edad")) && !Utilidades.IsNullOrEmpty(request.getParameter("edad"))){
			pEdad = Integer.parseInt(request.getParameter("edad"));
		} else {
			throw new PersonaException(PersonaException.MENSAJE_EXCEPCION_EDAD_INVALIDO);
		}
		if("true".equalsIgnoreCase(request.getParameter("aprobado"))){
			pAprobado = true;
		} else if ("false".equalsIgnoreCase(request.getParameter("aprobado"))){
			pAprobado = false;
		} else {
			throw new PersonaException(PersonaException.MENSAJE_EXCEPCION_APROBADO_INVALIDO);
		}
				
		if(Utilidades.isNumeric(request.getParameter("nota")) && !Utilidades.IsNullOrEmpty(request.getParameter("nota"))){
			pNota = Float.parseFloat(request.getParameter("nota"));
		} else {
			throw new PersonaException(PersonaException.MENSAJE_EXCEPCION_NOTA_INVALIDO);
		}
	}

}