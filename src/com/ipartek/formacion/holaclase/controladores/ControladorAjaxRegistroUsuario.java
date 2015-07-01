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
		//Respuesta tipo Json. Por defecto un servlet envía un text/html
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		
		//variable tipo PrintWriter para escribir response(respuesta) como el Return
		PrintWriter out = response.getWriter();
		
		//out.print("Hola soy una respuesta");
		
		//parámetro usuario e email recogidos del formulario dentro de operador ternario.
		//Si es null devuelve cadena vacía, si es false devuelve el propio parámetro
		String usuario = (request.getParameter("usuario")==null)?"":request.getParameter("usuario");
		String email = (request.getParameter("email")==null)?"":request.getParameter("email");
		boolean libre_usuario = false;
		boolean libre_email = false;
		boolean email_correcto = false; //Para comprobar que esté bien escrito
		
		//Comparación de cadenas. Si está en blanco y además no existe en el arrayList
		if ( !"".equalsIgnoreCase(usuario) && !listaUsuarios.contains(usuario) ){
			libre_usuario = true;
		}
		
		//Comprobar Email no es cadena vacía y que no exista
		if ( !"".equalsIgnoreCase(email) && !listaUsuarios.contains(email) ){
			libre_email = true;
		}
		
		//TODO Comprobar email válido
		
		//Formatear las response
		
		out.print("{");
			out.print("\"libre_usuario\":"+libre_usuario+","); //Devuelve un booleano
			out.print("\"libre_email\":"+libre_email+","); //Devuelve un booleano
			out.print("\"usuario\":\"" + usuario + "\" ,"); //Devuelve una cadena
			out.print("\"email\":\"" + email + "\""); //Devuelve una cadena
		out.print("}");
		
		//libera el buffer del PrintWriter
		out.flush();
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          

}

