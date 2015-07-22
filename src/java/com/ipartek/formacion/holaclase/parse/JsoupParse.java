package com.ipartek.formacion.holaclase.parse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class JsoupParse {

	static final String URL = "http://example.com/";
	static final String FILE_NAME = "prueba.txt";
	static final String FILE_FOLDER = "files/";

	// public JsoupParse() {
	// TODO Auto-generated constructor stub
	// }

	public static void main(String[] args) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		String html = "";

		Document doc;
		String body = "";

		// Apertura del fichero y creacion de BufferedReader para poder
		// hacer una lectura comoda (disponer del metodo readLine()).
		archivo = new File(FILE_FOLDER + FILE_NAME);
		if (!archivo.exists()) {
			System.out.println("Conectamos con URL");
			try {
				doc = Jsoup.connect(URL).data("query", "Java")
						.userAgent("Mozilla").cookie("auth", "token")
						.timeout(10000).post();

				body = doc.html();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("Guardamos en disco");
			FileWriter fichero = null;
			PrintWriter pw = null;
			try {
				fichero = new FileWriter(FILE_FOLDER + FILE_NAME);
				pw = new PrintWriter(fichero);

				pw.println(body);

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
			archivo = new File(FILE_FOLDER + FILE_NAME);
			System.out.println("Fichero guardado");
		} else {
			System.out.println("Leemos fichero");
		}
		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			// Lectura del fichero
			String linea;
			while ((linea = br.readLine()) != null)
				html += linea;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("Fichero leido");
		if (html != "") {
			System.out.println("Comenzamos parseo");

			doc = Jsoup.parse(html);
			Elements enlaces = doc.select("a[href]");
			System.out.println(enlaces);

			System.out.println("Termniamos parseo");

		} else {

		}

	}
}
