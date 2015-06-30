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
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//declarar array con nombres de usuarios
		//Utilizamos una clase de java, para hacer un casting utlizamos <String>
		ArrayList<String> listaUsuarios = new ArrayList<String>();
		
		listaUsuarios.add("ander");
		listaUsuarios.add("pepe");
		listaUsuarios.add("marimotxos");
		listaUsuarios.add("doaraemon");
		listaUsuarios.add("callou");
		
		//declarar array con email de los usuarios
		ArrayList<String> listaEmail = new ArrayList<String>();
		
		listaEmail.add("ander@email.com");
		listaEmail.add("pepe@email.com");
		listaEmail.add("marimotxos@email.com");
		listaEmail.add("doaraemon@email.com");
		listaEmail.add("callou@email.com");

		
		//respuesta tipo Json
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		
		//variable tipo PrintWriter para escribir response
		PrintWriter out = response.getWriter();
		
		//parametro usuario, email, pass, repass
		//operador ternario  (CONDICION) ? cumpleLaCondicion : NOcumpleLaCondicion
		String usuario = (request.getParameter("usuario")==null)?"":request.getParameter("usuario");
		String email   = (request.getParameter("email")==null)?"":request.getParameter("email");
		/*
		String pass    = (request.getParameter("pass")==null)?"":request.getParameter("pass");
		String repass  = (request.getParameter("repass")==null)?"":request.getParameter("repass");
		*/

		//Inicio de Json
		out.print("{");
		
		if ( null != usuario && usuario.length() > 0 ){
			//comprobar que no exista el usuario		
			
			if ( listaUsuarios.contains( usuario ) ){
			
				//out.print("Usuario Existe, por favor elige otro");
				out.print("\"existeUsuario\": true , \"user\": \""+usuario+"\"");
			}else{
				//out.print("Usuario Disponible");
				out.print("\"existeUsuario\": false , \"user\": \""+usuario+"\"");
			}
					
		}else{
			//out.print("Usuario Disponible");
			out.print("\"existeUsuario\": null , \"user\": null");
		}

		//comprobar que no exista el email
		if ( null != email && email.length() > 0 ){

			if ( listaEmail.contains( email ) ){
				
				out.print(", \"existeEmail\": true , \"e-mail\": \""+email+"\"");
			}else{
				out.print(", \"existeEmail\": false , \"e-mail\": \""+email+"\"");
			}
					
		}else{
			out.print(", \"existeEmail\": null , \"e-mail\": null");
		}
		//TODO comprobar que el email es valido
		
		//Comprobar la contraseña, tienes que que iguales pass y repass
		
		/* Lo vamos a comprobar con javascript
		if ( pass.length() > 0 || repass.length() > 0){

			if ( pass.equals(repass) ){
				
				out.print(", \"passCorrecta\": true , \"pass\": \""+pass+"\"");
			}else{
				out.print(", \"passCorrecta\": false , \"pass\": \""+pass+"\"");
			}
					
		}else{
			out.print(", \"passCorrecta\": null , \"pass\": null");
		}
		*/
		
		//Final de Json
		out.print("}");
		
		//libera el buffer del PrintWriter
		out.flush();		
		
	}

}
