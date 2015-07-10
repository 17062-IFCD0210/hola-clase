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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Declarar array con nombres de usuarios
		ArrayList<String> listaUsuarios = new ArrayList<String>();
		listaUsuarios.add("Ander");
		listaUsuarios.add("Pepe");
		listaUsuarios.add("Marimotxos");
		listaUsuarios.add("Ambrosio");
		listaUsuarios.add("Doraemon");
		listaUsuarios.add("Caillou");
		
		//Declarar array con emails aleatorios
		ArrayList<String> listaMails = new ArrayList<String>();
		listaMails.add("aa@aa.com");
		listaMails.add("bb@bb.com");
		listaMails.add("cc@cc.com");
		
		
		//Respuesta tipo JSON
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		
		//Variable tipo PrintWriter para escribir response
		PrintWriter out = response.getWriter();
		
		//out.print("Hola soy una respuesta");
		String usuario = request.getParameter("usuario");
		String mail = request.getParameter("mail");
		String pass = request.getParameter("pass");
		String repass = request.getParameter("repass");
		
		if(null != usuario && null != mail && null != pass && null != repass) {
			//comprobar que no exista el usuario
			if (listaUsuarios.contains(usuario)) {
				//out.print("Usuario Existente, por favor elige otro");
				out.print("{ \"existe\": true , \"user\": \""+usuario+"\" , ");
			} else {
				//out.print("Usuario Disponible");
				out.print("{ \"existe\": false , \"user\": \""+usuario+"\" , ");
			}
			
			//comprobar que no exista el mail
			if (listaMails.contains(mail)) {
				//out.print("Mail Existente, por favor elige otro");
				out.print("\"existe_mail\": true , \"mail\": \""+mail+"\" , ");
			} else {
				//out.print("Mail Disponible");
				out.print("\"existe_mail\": false , \"mail\": \""+mail+"\" , ");
			}
			
			//Comprobar que se repitan las contraseñas
			if(pass.equals(repass)) {
				out.print("\"iguales\": true , \"pass\": \""+ pass + "\" , \"repass\": \""+ repass + "\" }");
			} else {
				out.print("\"iguales\": false , \"pass\": \""+ pass + "\" , \"repass\": \""+ repass + "\" }");
			}
		} else {
			out.print("\"existe\": false , \"user\": \"pepe\" }");
		}
		
		//libera el buffer del PrintWriter
		out.flush();
		
	}

}
