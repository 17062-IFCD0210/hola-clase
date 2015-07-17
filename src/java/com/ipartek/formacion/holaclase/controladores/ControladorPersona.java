package com.ipartek.formacion.holaclase.controladores;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.holaclase.poo.bean.Persona;
import com.ipartek.formacion.holaclase.poo.ejemplos.PersonaExcepcion;

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
	String pEdad;
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
		//El cliente recibe información (pinchas en una lista de personas para recibir todos sus datos)
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Enviamos desde el cliente información (formulario)
		try{
			//recoger parametros del formulario en una función
			getParameters(request);
					
			
			//validar los datos
			
			//crear Persona
			Persona p = new Persona();
			p.setNombre( pNombre );
			p.setApellido(pApellido);
			p.setEmail(pEmail);
			p.setEdad(Integer.parseInt(pEdad));
			p.setAprobado(pAprobado);
			p.setNota(pNota);
			
			//guardamos en la BBDD		
			
			//enviar attributo para mensaje
			request.setAttribute("msg", "Zorionak te has dado de alta");
			//enviar attributo Persona
			request.setAttribute("persona", p );
			
			//Ir a => personaDetalle.jsp. Que devuelva al usuario el mensaje en pantalla de Zorionak, todo Ok!
			dispatcher = request.getRequestDispatcher("includes/persona/personaDetalle.jsp");
		
		}catch ( PersonaExcepcion e){
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
	private void getParameters(HttpServletRequest request) throws PersonaExcepcion{ //con throws mandamos para arriba la excepción
		//Recogemos los parámetros que vienen como tipo String
		pNombre = request.getParameter("nombre");
		pApellido = request.getParameter("apellido");
		pEmail = request.getParameter("email");
		
		if ("si".equalsIgnoreCase(request.getParameter("aprobado"))){
			pAprobado = true;
		}
		
		try{ //en el caso de que se haya introducido un valor que no sea numérico entra
			pEdad = request.getParameter("edad");
		}catch (Exception e){
			throw new PersonaExcepcion(PersonaExcepcion.EXCEPCION_RANGO_NO_VALIDO);
		}
		
		try{ //en el caso de que se haya introducido un valor que no sea numérico entra
			pNota = Float.parseFloat(request.getParameter("nota"));
		}catch (Exception e){
			throw new PersonaExcepcion(PersonaExcepcion.EXCEPCION_RANGO_NOTA_NO_VALIDO);
		}
		
	}

}