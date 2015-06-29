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
		//Si me llamas por doGet le remitimos al doPost
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Le devolvemos la respuesta
		
		//Declarar array con nombres de usuarios de objetos tipo String, se puede omitir
		ArrayList<String> listaUsuarios = new ArrayList<String>();
		listaUsuarios.add("ander");
		listaUsuarios.add("pepe");
		listaUsuarios.add("marimototx");
		listaUsuarios.add("ambrosio");
		listaUsuarios.add("doraemon");
		listaUsuarios.add("callou");
		listaUsuarios.add("pirulin");
		
		ArrayList<String> listaEmail = new ArrayList<String>();
		listaUsuarios.add("ander@hotmail.com");
		listaUsuarios.add("pepe@hotmail.com");
		listaUsuarios.add("marimototx@hotmail.com");
		listaUsuarios.add("ambrosio@hotmail.com");
		listaUsuarios.add("doraemon@hotmail.com");
		listaUsuarios.add("callou@hotmail.com");
		listaUsuarios.add("pirulin@hotmail.com");
		
		//Hay que declarar el tipo de respuesta antes del PrintWriter porque éste utiliza text/html
		//Respuesta tipo Json
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		
		//variable tipo PrintWriter para escribir response(respuesta) COMO el Return
		PrintWriter out = response.getWriter();
		
		//out.print("Hola soy una respuesta");
		
		//parámetro usuario e email recogidos del formulario
		String usuario = request.getParameter("usuario");
		String email = request.getParameter("email");
		
		//Comprobar que no exista el usuario
		if ( null != usuario ){
			if ( listaUsuarios.contains(usuario) ){
				//out.print("Usuario existe, elige otro");
				out.print("{ \"existe\": "+true+" , \"user\": \""+usuario+"\" }");
			}else{
				//out.print("Usuario disponible");
				out.print("{ \"existe\": "+false+" , \"user\": \""+usuario+"\" }");
			
			//out.print("Ongietorri " + request.getParameter("usuario"));
			}


		}else{
				out.print("Usuario disponible");
				out.print("{ \"existe\": "+true+" , \"user\": \"pepe\" }");
			}
		
		//Comprobar que no exista el email
		if ( null != email ){
			if ( listaEmail.contains(email) ){
				out.print("{ \"existe\": "+true+" , \"user\": \""+email+"\" }");
			}else{
				out.print("{ \"existe\": "+false+" , \"user\": \""+email+"\" }");
			}
		}else{
			out.print("{ \"existe\": "+true+" , \"user\": \""+email+"\" }");
		}
		
		
		//libera el buffer del PrintWriter
				out.flush();
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          

}
