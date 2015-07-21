package com.ipartek.formacion.holaclase.parse;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupParse {

	static final String URL = "http://example.com/"; 
	static final String RUTA_FICHERO = "/txt/html.txt";
	
	public static void main(String[] args) {
		
		System.out.println("Comenzamos parseo");
		
		Document doc;
		String tituloPagina = "";
		//ArrayEnlaces<String> enlaces = new
		
		try {

			//Guardarlo al HD
			File archivo = new File(RUTA_FICHERO);
			BufferedWriter bw;
			if(archivo.exists()) { //Si existe parseo el fichero
				
				parsearFichero();
				System.out.println("El fichero ya existe, se cargará el contenido");
				
				//TODO parsear
				
			} else { //Si no existe me conecto a la web y la cojo
				doc = Jsoup.connect(URL).get();
				System.out.println("Conectado");
				
				//Obtener todo el código fuente (html) de la página
				System.out.println(doc.html());
				tituloPagina = doc.title();
				System.out.println("Title: " + tituloPagina);
				
				Elements enlaces = doc.getElementsByTag("a");
				System.out.println("Enlaces encontrados: " + enlaces.size());
				//System.out.println(enlaces);
				
				Element enlace = null;
				String urlSalto = null;
				
				for (int i=0 ; i<enlaces.size(); i++){ //otra forma
					 enlace = enlaces.get(i);
					 urlSalto = enlace.attr("href");
					 if (urlSalto != null && !"".equals(urlSalto) ){
						doc = Jsoup.connect(urlSalto).get();
						tituloPagina = doc.title();
						System.out.println("    Title: " + tituloPagina);
					 }else {
						System.out.println("No se ha encontrado url");
						
					 }
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Terminamos parseo");

		public void parsearFichero(){
			
		}

	}

}
