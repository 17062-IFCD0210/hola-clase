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
		listaUsuarios.add("callou");
				
		
		//respuesta tipo Json
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		//variable tipo PrintWriter para escribir response
		PrintWriter out = response.getWriter();
		
		//parametro usuario
		String usuario = request.getParameter("usuario");
		
		
		if ( null != usuario  ){
			//compobar que no exista el usuario		
			
			if ( listaUsuarios.contains( usuario ) ){
			
				//out.print("Usuario Existe, por favor elige otro");
				out.print("{ \"existe\": true , \"user\": \""+usuario+"\" }");
			}else{
				//out.print("Usuario Disponible");
				out.print("{ \"existe\": false , \"user\": \""+usuario+"\" }");
			}
					
		}else{
			//out.print("Usuario Disponible");
			out.print("{ \"existe\": false , \"user\": \"pepe\" }");
		}
		
		//libera el buffer del PrintWriter
		out.flush();
		
	}

}
