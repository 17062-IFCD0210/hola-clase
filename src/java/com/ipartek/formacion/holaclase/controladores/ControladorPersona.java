package com.ipartek.formacion.holaclase.controladores;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.holaclase.poo.bean.Alumno;
import com.ipartek.formacion.holaclase.poo.bean.Persona;
import com.ipartek.formacion.holaclase.poo.ejemplos.PersonaException;

/**
 * Servlet implementation class ControladorPersona
 */
public class ControladorPersona extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
		RequestDispatcher dispatcher;
		
		//parametros
		private String pNombre;
		private String pApellido;
		private int pEdad;
		private String pEmail;
		private boolean pAprobado;
		private float pNota;
		
	
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
			validarDatos();
				
			//crear Persona
			Persona p = new Persona();
			p.setNombre(pNombre);
			p.setApellido(pApellido);
			p.setEdad(pEdad);
			p.setEmail(pEmail);
			
			//TODO cambiar Persona por Alumno
			//p.setNota(pNota);
			//p.setAprobado(pAprobado);	
			
			//guardar Persona en la BBDD
			
			// enviar atributo para mensaje
			request.setAttribute("msg", "Zorionak te has dado de alta"); 
			//msg es la key y Zorionak... el value
	
			//enviar atributo Persona
			request.setAttribute("persona", p);
			
			//Ir a => personaDetalle.jsp
			dispatcher = request.getRequestDispatcher("includes/persona/personaDetalle.jsp");

		}catch(PersonaException e){
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage() );
			dispatcher = request.getRequestDispatcher("includes/persona/personaFormulario.jsp");
		}catch(Exception e){
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage() );
			dispatcher = request.getRequestDispatcher("plantillas/error.jsp");
		}finally{
			//despachar
			dispatcher.forward(request, response);
		}
	
	}
	
	/**
		 * Recoger los parametros enviados
		 * @param request
	 * @throws PersonaException 
		 */
		private void getParameters(HttpServletRequest request) throws PersonaException {
	
			pNombre = request.getParameter("nombre"); //es el name del input
			pApellido = request.getParameter("apellido");
			pEmail = request.getParameter("email");
			try{
				pEdad = Integer.parseInt(request.getParameter("edad"));
			}catch(Exception e){
				throw new PersonaException(PersonaException.EDAD_NO_VALIDA);
			}
			if(!"si".equalsIgnoreCase(request.getParameter("aprobado"))){
				if (!"no".equalsIgnoreCase(request.getParameter("aprobado"))){
					throw new PersonaException("Ni aprobado ni suspendido");
				}
			}
			pAprobado="si".equalsIgnoreCase((request.getParameter("aprobado")));
			if("".equalsIgnoreCase(request.getParameter("nota"))) throw new PersonaException("La nota esta vacia");
			try{
				pNota =Float.parseFloat(request.getParameter("nota"));
			}catch(Exception e){
				throw new PersonaException(PersonaException.NOTA_NO_VALIDA);
			}
		}

		/**
		 * Valida los parametros recodigos
		 * @throws PersonaException 
		 * 
		 */
		private void validarDatos() throws PersonaException {
		
			if("".equals(pNombre)) throw new PersonaException("Nombre vacio");
			if("".equals(pApellido)) throw new PersonaException("Apellido vacio");
			if("".equals(pEmail)) throw new PersonaException("Email vacio");
			if((pNota<0)||(pNota>10)) throw new PersonaException("Nota no valida");
		}

}
