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
		doPost(request, response); // si llamamos por get puenteamos a doPost
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//declarar array con nombres de usuarios
		ArrayList<String> listaUsuarios = new ArrayList<String>();
		listaUsuarios.add("ander");
		listaUsuarios.add("pepe");
		listaUsuarios.add("marimotxos");
		listaUsuarios.add("ambrosio");
		listaUsuarios.add("doraemon");
		listaUsuarios.add("callou");
		
		ArrayList<String> listaEmails = new ArrayList<String>();
		listaEmails.add("ander@ipartek.com");
		listaEmails.add("pepe@pepe.es");
		listaEmails.add("marimotxos@gmail.om");
		listaEmails.add("ambrosio@gmail.com");
		listaEmails.add("doraemon@hotmail.com");
		listaEmails.add("callou@pepe.es");
		
		//respuesta tipo Json
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		
		//variable tipo PrintWriter para escribir response
		PrintWriter out = response.getWriter();

		//out.print("Hola soy una respuesta");
		
		//parametros
		String usuario			= (request.getParameter("usuario")==null) ? "" : request.getParameter("usuario");
			// operador ternario --> es como un if(request.getParameter("usuario")==null) usuario="" else usuario= request.getParameter("usuario")
			// variable = (condicion)? valor1 : valor2;
		String email			= (request.getParameter("email")==null) ? "" : request.getParameter("email");
		boolean libre_usuario 	= false;
		boolean libre_email 	= false;
		boolean email_correcto	= false; // para comprobar que sea un email falso

		//comprobacion de los campos

		//comprueba que usuario sea diferente de cadena vacia y que no este en a lista de usuarios
		if ( !"".equalsIgnoreCase(usuario) && !listaUsuarios.contains(usuario)){ 
			libre_usuario=true;
		}
		
		//comprobar Email no es cadena vacia y que no exista
		if ( !"".equalsIgnoreCase(email) && !listaEmails.contains(email)){ 
			libre_email=true;
		}
		
		//TODO comprobar email valido
		
		//formatear la response
		out.print("{");
			out.print("\"libre_usuario\":"+libre_usuario+",");
			out.print("\"libre_email\":"+libre_email+",");
			out.print("\"usuario\":\""+usuario+"\","); //añadimos comillas dobles al nombre del usuario y al email por ser strings
			out.print("\"email\":\""+email+"\"");
		out.print("}");
		out.flush(); //libera el buffer		
	}

}
