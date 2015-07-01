package com.ipartek.formacion.holaclase.controladores;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTML;

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
		listaUsuarios.add("marimotxos");
		listaUsuarios.add("ambrosio");
		listaUsuarios.add("doraemon");
		listaUsuarios.add("caillou");
		
		ArrayList<String> listaEmails = new ArrayList<String>();
		listaEmails.add("ander@ipartek.es");
		listaEmails.add("pepe@pepe.es");
		listaEmails.add("marimotxos@mari.es");
		listaEmails.add("ambrosio@ferrero.es");
		listaEmails.add("doraemon@novita.jp");
		listaEmails.add("caillou@caillou.es");
				
		
		//respuesta tipo Json
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		//variable tipo PrintWriter para escribir response
		PrintWriter out = response.getWriter();
		
		//parametro usuario
		String id = request.getParameter("id");
		String val = request.getParameter("val");
		
		switch (id){
		case "usuario":
			
			if ( null != val  ){
				//compobar que no exista el usuario		
				
				if ( listaUsuarios.contains( val ) ){
				
					//out.print("Usuario Existe, por favor elige otro");
					out.print("{ \"existe\": false , \"user\": \""+val+"\", \"mensaje\": \"El usuario existe, por favor elige otro\" }");
				}else{
					//out.print("Usuario Disponible");
					out.print("{ \"existe\": true , \"user\": \""+val+"\" , \"mensaje\": \"Usuario disponible\" }");
				}
						
			}else{
				//out.print("Usuario Disponible");
				out.print("{ \"existe\": false , \"user\": \"pepe\" }");
			}
			
			break;
		case "email":
			
			//TODO comprobar email valido
			
			if ( null != val  ){
				//compobar que no exista el usuario		
				
				if ( listaEmails.contains( val ) ){
				
					//out.print("Usuario Existe, por favor elige otro");
					out.print("{ \"existe\": false , \"user\": \""+val+"\", \"mensaje\": \"El email existe, por favor elige otro\" }");
				}else{
					//out.print("Usuario Disponible");
					out.print("{ \"existe\": true , \"user\": \""+val+"\" , \"mensaje\": \"Email disponible\" }");
				}
						
			}else{
				//out.print("Usuario Disponible");
				out.print("{ \"existe\": false , \"user\": \"pepe\" }");
			}
			
			break;
		
		default:
		
		}
		
		//libera el buffer del PrintWriter
		out.flush();
		
	}

}