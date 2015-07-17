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
	
	RequestDispatcher dispatcher;
	
	//parametros
	String pNombre;
	String pEdad;
	
       
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
			p.setEdad( Integer.parseInt(pEdad) );
			
			//guardamos en la BBDD		
			
			//enviar attributo para mensaje
			request.setAttribute("msg", "Zorionak te has dado de alta");
			//enviar attributo Persona
			request.setAttribute("persona", p );
			//Ir a => personaDetalle.jsp
			dispatcher = request.getRequestDispatcher("includes/persona/personaDetalle.jsp");
			
		
		}catch ( PersonaException e){
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage() );
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
		
	}

}
