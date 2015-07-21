package com.ipartek.formacion.holaclase.parse;

import java.io.FileWriter;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JsoupParse {

	static final String URL = "http://zonasdeescalada.com/zonas?title=&field_comunidad_ciudad_tid=163&field_escuela_mejor_epoca_tid=All&field_escuela_calidad_zona_tid_1=All&field_escuela_roca_tid=All&field_tipos_de_escalada_tid=All";
	static final String PATH = "c:/prueba.txt";

	public static void main(String[] args) {

		System.out.println("Comenzamos parseo: " + URL);

		Document doc;
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			doc = Jsoup.connect(URL).get();
			System.out.println("Conectado");

			fichero = new FileWriter("c:/prueba.txt");
			new PrintWriter(fichero);

			pw.println(doc.html());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Nuevamente aprovechamos el finally para
				// asegurarnos que se cierra el fichero.
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		// titlePagina = doc.title();
		// System.out.println("Title = " + titlePagina);
		//
		// Elements enlaces = doc.getElementsByTag("a");
		// System.out.println("Enlaces encontrados: " + enlaces.size());
		//
		// // System.out.println(enlaces);
		// Element enlace = null;
		// String urlSalto = null;
		// for (int i = 0; i < enlaces.size(); i++) {
		// enlace = enlaces.get(i);
		// urlSalto = enlace.attr("href");
		// System.out.println(urlSalto);
		// // if (urlSalto != null && !("".equals(urlSalto))) {
		// // doc = Jsoup.connect(urlSalto).get();
		// //
		// // titlePagina = doc.title();
		// // System.out.println("	Title = " + titlePagina);
		// // } else {
		// // System.out.println("No se ha encontrado la URL");
		// // }
		// }
		//
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		System.out.println("Terminamos parseo");

	}
}
