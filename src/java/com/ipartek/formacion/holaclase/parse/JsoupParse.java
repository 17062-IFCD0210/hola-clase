package com.ipartek.formacion.holaclase.parse;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupParse {

	static final String URL = "http://example.com/";

	public static void main(String[] args) {

		System.out.println("Comenzamos parseo " + URL);

		Document doc;
		String titlePagina = "";
		// ArrayList<String> enlaces = new ArrayAllocationExpression()

		try {
			doc = Jsoup.connect(URL).get();
			System.out.println("Conectado");
			
			//Obtener el codigo fuente
			System.out.println( doc.html() );

			titlePagina = doc.title();
			System.out.println("Title= " + titlePagina);

			Elements enlaces = doc.getElementsByTag("a");
			System.out.println("Enlaces encontrados= " + enlaces.size());
			//System.out.println(enlaces);
			
			Element enlace = null;
			String urlSalto = null;
			for (int i = 0; i < enlaces.size(); i++) {
				 enlace = enlaces.get(i);
				 urlSalto = enlace.attr("href");
				 System.out.println(urlSalto);
				 if(urlSalto != null && !"".equals(urlSalto)){
					 
					 	doc = Jsoup.connect(urlSalto).get();
					 	titlePagina = doc.title();
						System.out.println("   Title= " + titlePagina);
						
				 }else{
					 System.out.println("No se ha encontrado la URL");
				 }
				 
				 
			}
			

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Terminamos parseo");

	}
}
