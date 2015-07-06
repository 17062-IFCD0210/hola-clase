package com.ipartek.formacion.holaclase.controladores;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTML;

import com.ipartek.formacion.holaclase.Utilidades;

/**
 * Servlet implementation class ControladorAjaxRegistroUsuario
 */
public class ControladorAjaxRegistroUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorAjaxRegistroUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		//declarar array con nombres de usuarios
		ArrayList<String> listaUsuarios = new ArrayList<String>();
		listaUsuarios.add("ander");
		listaUsuarios.add("pepe");
				
		ArrayList<String> listaEmail = new ArrayList<String>();
		listaEmail.add("ander@ander.com");
		listaEmail.add("pepe@pepe.com");
		
				
		
		//respuesta tipo Json
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		//variable tipo PrintWriter para escribir response
		PrintWriter out = response.getWriter();
		
		//parametros
		String  usuario        = (request.getParameter("usuario")==null) ? "" : request.getParameter("usuario");
		String  email          = (request.getParameter("email")==null)   ? "" : request.getParameter("email");
		boolean libre_usuario  = false;
		boolean libre_email    = false;
		boolean email_correcto = false; // para comprobar que sea un email valido
		
	//comprobacion de los campos
		
		//Usuario No es cadena Vacia y No existe
		if ( !"".equalsIgnoreCase(usuario) && 
			 !listaUsuarios.contains(usuario) 
			){		
			libre_usuario = true;
		}		
		
			
		//TODO comprobar email valido
		if ( Utilidades.isEmail(email) ){
			if ( !"".equalsIgnoreCase(email) &&
				!listaEmail.contains(email)){		
					libre_email = true;
			}
		}
		
		
	//formatear las response	
	out.print("{");
		out.print("\"libre_usuario\":"+libre_usuario+",");
		out.print("\"libre_email\":" + libre_email+",");
		out.print("\"usuario\":\""+usuario+"\",");
		out.print("\"email\": \""+email+"\"");
	out.print("}");
			
	//libera el buffer del PrintWriter
	out.flush();


/**
 * Servlet implementation class ControladorAjaxRegistroUsuario
 */
public class ControladorAjaxRegistroUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorAjaxRegistroUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Declarar array con nombres de usuarios
		ArrayList<String> listaUsuarios = new ArrayList<String>();
		listaUsuarios.add("ander");
		listaUsuarios.add("pepe");
		listaUsuarios.add("marimotxos");
		listaUsuarios.add("mikel");
		
		// respuests tipo Json
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		//variable tipo PrintWriter para escribir response
		PrintWriter out = response.getWriter();
		
		//parametro usuario
		String usuario = request.getParameter("usuario");
			
		if ( null != usuario ) {
			//Comprobar que no exista el usuario
			
			if ( listaUsuarios.contains( usuario ) ) {
				
				//out.print("Usuario Existe, por favor elige otro");
				out.print("{ \"existe\": true , \"user\": \""+usuario+"\" }");
				
			}else {
				//out.print("Usuario Disponible");
				out.print("{ \"existe\": false , \"user\": \""+usuario+"\" }");
			}
			
		} else {
			//out.print("Usuario Disponible");
			out.print("{ \"existe\": false , \"user\": \"pepe\" }");
		}
		
		//libera el buffer del PrintWriter
		out.flush();
		

		
	}

}
