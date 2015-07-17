package com.ipartek.formacion.holaclase.controladores;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.holaclase.poo.bean.Persona;
import com.ipartek.formacion.holaclase.poo.ejemplos.PersonaException;
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
	String pEdad;
	String pAprobado;
	String pNota;
	
       
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
			p.setNombre( pNombre );
			p.setApellido(pApellido);
			p.setEmail(pEmail);			
			if(!Utilidades.IsNullOrEmpty(pEdad) && Utilidades.isNumeric(pNota)){
				p.setEdad( Integer.parseInt(pEdad) );
			} else {
				throw new PersonaException("Edad vacia o no valida");
			}
			if("true".equals(pAprobado)||"false".equals(pAprobado)){
				p.setAprobado(Boolean.parseBoolean(pAprobado));
			} else {
				throw new PersonaException("Aprobado o Suspendido??");
			}			
			if(Utilidades.isNumeric(pNota) && !Utilidades.IsNullOrEmpty(pNota)){
				p.setNota( Integer.parseInt(pNota));
			} else {
				throw new PersonaException("Nota no valida");
			}

			
			//guardamos en la BBDD		
			
			//enviar attributo para mensaje
			request.setAttribute("msg", "Zorionak te has dado de alta");
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
	 */
	private void getParameters(HttpServletRequest request) {
		pNombre = request.getParameter("nombre");
		pApellido = request.getParameter("apellido");
		pEmail = request.getParameter("apellido");
		pEdad = request.getParameter("edad");
		pAprobado = request.getParameter("aprobado");
		pNota = request.getParameter("nota");		
	}

}