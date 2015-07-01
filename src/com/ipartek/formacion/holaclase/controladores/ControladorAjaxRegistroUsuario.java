package com.ipartek.formacion.holaclase.controladores;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		doPost(request, response);//puenteamos para que sea por el metodo que sea nos haga lo mismo
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//declarar array cn nombres de usuarios;que solo contenga variables de tipo <string>
		ArrayList<String> listaUsuarios = new ArrayList<String>();
		listaUsuarios.add("ander");
		listaUsuarios.add("pepe");
		listaUsuarios.add("marimotxos");
		listaUsuarios.add("ambrosio");
		
		ArrayList<String> listaEmails = new ArrayList<String>();
		listaEmails.add("lara@lara.com");
		listaEmails.add("pepe@pepe.com");
		
		//Respuesta tipo JSON
		response.setContentType("aplication/json");
		response.setCharacterEncoding("utf-8");
		//variable tipo PrintWriter para escribir
		PrintWriter out = response.getWriter();
		
		//parametros
		String usuario 			= (request.getParameter("usuario")	== null ) ? "" : request.getParameter("usuario");
		String email   			= (request.getParameter("email")	== null ) ? "" : request.getParameter("email");
		boolean libre_usuario	= false;
		boolean libre_email 	= false;
		boolean email_correcto	= false; //para comprobar que sea un email valido
		
		//comprobacion de los campos
		
		//usuario es cadena vacia y ademas no existe
		if (!"".equalsIgnoreCase( usuario ) && 
			!listaUsuarios.contains(usuario)
			){
			libre_usuario = true;
		}
		//comprobar email no es cadena vacia
		if (!"".equalsIgnoreCase( email ) && 
				!listaEmails.contains(email)
				){
				libre_email = true;
			}
		
		
		// TODO comprobar email valido
		
		
	//formatear la response

	out.print("{");
		out.print("\"libre_usuario\":"+libre_usuario+",");
		out.print("\"libre_email\":"+libre_email+",");
		out.print("\"usuario\":\""+usuario+"\",");
		out.print("\"email\":\""+email+"\"");
	out.print("}");
		
	//libera el buffer del PrintWriter	
	out.flush();
	
	}
}

		

