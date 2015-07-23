package com.ipartek.formacion.holaclase.controladores;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.holaclase.poo.bean.Alumno;
import com.ipartek.formacion.holaclase.poo.ejemplos.ExcepcionPersona;

/**
 * Servlet implementation class ControladorPersona
 */
public class ControladorPersona extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher dispatcher;

	String pNombre;
	String pApellido;
	String pEdad;
	String pEmail;
	String pAprobado;
	String pNota;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControladorPersona() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// Recoger parametros del formulario
		this.getParameters(request);
		boolean todoBien = false;
		// Validar los datos
		try {
			// Crear Persona
			Alumno p = new Alumno();
			p.setNombre(pNombre);
			p.setApellido(pApellido);
			p.setEdad(Integer.parseInt(pEdad));
			p.setEmail(pEmail);
			p.setNota(Float.parseFloat(pNota));

			if ((pAprobado == null && (p.getNota() >= 5))
					|| (pAprobado != null && (p.getNota() < 5))) {
				request.setAttribute("msg",
						"Atributo Aprobado o nota no valida.");
				dispatcher = request
						.getRequestDispatcher("includes/persona/personaForm.jsp");
			} else if (pAprobado != null) {
				p.setAprobado(true);
				todoBien = true; // Validando que todo este bien
			} else {
				p.setAprobado(false);
				todoBien = true; // Validando que todo este bien
			}

			// Comprobamos las validaciones
			if (todoBien) {
				// Guardamos en la BBDD

				// Enviar atributo para mensaje
				request.setAttribute("msg", "Zorionak, te has dado de alta");

				// Enviar atributo persona
				request.setAttribute("persona", p);

				// Ir a => personaDetalle.jsp
				dispatcher = request
						.getRequestDispatcher("includes/persona/personaDetalle.jsp");
			}

		} catch (ExcepcionPersona e) {
			// Excepcion persona para cuando la edad es menor, mayor, o negativa
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			dispatcher = request
					.getRequestDispatcher("includes/persona/personaForm.jsp");
		} catch (NumberFormatException e) {
			// Excepcion numerica cuando la edad o la nota son letras
			e.printStackTrace();
			request.setAttribute("msg",
					"Error de formato. La Edad y/o la nota deben ser numericos");
			dispatcher = request
					.getRequestDispatcher("includes/persona/personaForm.jsp");
		} catch (Exception e) {
			// Excepcion global para cualquier error
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			dispatcher = request.getRequestDispatcher("plantillas/error.jsp");
		} finally {
			// Lanzamos el dispatcher
			dispatcher.forward(request, response);
		}

	}

	/**
	 * Cogemos los valores de los parametros en un metodo
	 *
	 * @param request
	 */
	private void getParameters(HttpServletRequest request) {
		// Recogemos parametros de la clase Persona
		pNombre = request.getParameter("nombre");
		pApellido = request.getParameter("apellido");
		pEdad = request.getParameter("edad");
		pEmail = request.getParameter("mail");
		pAprobado = request.getParameter("aprobado");
		pNota = request.getParameter("nota");
	}

}