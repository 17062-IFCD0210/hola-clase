package com.ipartek.formacion.holaclase.controladores;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControladorEjercicioFormulario
 */
public class ControladorEjercicioFormulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	RequestDispatcher dispatcher;
	
	//parametros
	private String pTexto;
	private int pRepeticiones;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorEjercicioFormulario() {
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
		
		String salida="";
		pTexto=request.getParameter("texto");
		pRepeticiones = Integer.parseInt(request.getParameter("repeticiones"));
		for(i=0;i<pRepeticiones;i++){
				salida=salida+pTexto;
			
		}
	}

}
