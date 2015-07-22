package com.ipartek.formacion.holaclase.parse;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



public class JsoupParse {

	public static final String URL = "http://www.iana.org/";
	
	public static void main(String[] args) {

		System.out.println("Comenzamos parseo: " + URL);

		
		Document doc;
		String titlePagina = "";
		String contenidoPagina = "";
		
		try {
			doc = Jsoup.connect(URL).get();
			System.out.println("Conectado");
					
//			System.out.println(doc.html());		//obtener el codigo fuente
			contenidoPagina = doc.html();
			
			titlePagina = doc.title();
			System.out.println("title= " + titlePagina);
			
			escribirEnArchivo(titlePagina, contenidoPagina);
			
			Elements enlaces = doc.getElementsByTag("a");
			System.out.println("Enlaces encontrados= " + enlaces.size());
//			System.out.println(enlaces);	//Mostrar enlaces
			
			escribirEnArchivo(titlePagina, enlaces.toString());
			
			Element enlace = null;
			String urlSalto = null;
			
//			for (int i = 0; i < enlaces.size(); i++) {
//				enlace = enlaces.get(i);
//				urlSalto = enlace.attr("href");
//				//System.out.println(urlSalto);
//				if(urlSalto != null && !"".equals(urlSalto)){
//					doc = Jsoup.connect(urlSalto).get();
//					
//					titlePagina = doc.title();
//					contenidoPagina = doc.html();
//					
//					escribirEnArchivo(titlePagina, contenidoPagina);
//					
//					System.out.println("    title= " + titlePagina);
//				} else {
//					System.out.println("    *No se a encontrado la url");					
//				}
//			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		


		
		
		
		System.out.println("Terminamos parseo");
	}
	
	public static void escribirEnArchivo(String nombre, String contenido) {
		
		String path = "C:\\Users\\curso\\Desktop\\Parseo";
		
		File f;
		f = new File(path, nombre + ".html");

		//Escritura
		try{
			FileWriter w = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(w);
			PrintWriter wr = new PrintWriter(bw);	
			wr.write(contenido);
			bw.close();
		}catch(IOException e){
			
		}
		
	}

}
