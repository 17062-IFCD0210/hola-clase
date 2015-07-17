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
	String pApellido;
	String pEmail;
	int pEdad;
	boolean pAprobado = false;
	float pNota;
	
	/**
	 * Recoger los parametros enviados
	 * @param request
	 * @throws PersonaException 
	 */
	private void getParameters(HttpServletRequest request) throws PersonaException {

		pNombre 	= request.getParameter("nombre");
		pApellido 	= request.getParameter("apellido");
		pEmail 		= request.getParameter("email");
		
		try {
			pEdad 	= Integer.parseInt( request.getParameter("edad") );
		} catch(Exception e) {
			throw new PersonaException( PersonaException.MSG_EDAD_RANGO);
		}
		
		
		if ("si".equalsIgnoreCase( request.getParameter("aprobado")) ){
			pAprobado=true;
		}
		
		
		try {
			pNota		= Float.parseFloat( request.getParameter("nota") );
		}catch (Exception e){
			throw new PersonaException( PersonaException.MSG_NOTA_RANGO);
		}
			
			
	}
	
       
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
			p.setApellido ( pApellido );
			p.setEmail( pEmail );
			p.setEdad ( pEdad );
			p.setAprobado(pAprobado);
			p.setNota( pNota );
		
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
			dispatcher.forward(request, response);			
		}	
				
		
	}



}