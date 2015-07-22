package com.ipartek.formacion.holaclase.parse;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.eclipse.jdt.internal.compiler.ast.ArrayAllocationExpression;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupParse {
	
	static final String URL = "http://example.com/";
	static final String FILE_FOLDER = "files/"; //carpeta a guardar html descargados
	static final String FILE_EXTENSION = ".html";

	public static void main(String[] args) {
		
		System.out.println("Comenzamos parseo: " + URL);
		
		Document doc;
		String titlePagina = "";
		//ArrsayList<String> enlaces = new ArrayAllocationExpression() 
		
		try {
			doc = Jsoup.connect(URL).get();
			System.out.println("Conectado");
	        
			//obtener el codigo fuente
			//System.out.println( doc.html() );
			
			titlePagina = doc.title();
			//System.out.println("Title= " + titlePagina );
			
			final File fichero = new File( FILE_FOLDER + titlePagina + FILE_EXTENSION );
			
			//Si no existe guardo el fichero
			if(!fichero.exists()) {
				FileUtils.writeStringToFile( fichero, doc.outerHtml(), "UTF-8");
			}
			
			//opcional
			String contenido = FileUtils.readFileToString(fichero, "UTF-8");
			System.out.println(contenido);
			
			//Ahora si que enlazamos con el fichero para parsearlo
			doc = Jsoup.parse(fichero, "UTF-8", URL);

			Elements enlaces = doc.getElementsByTag("a");
			System.out.println("Enlaces encontrados= " + enlaces.size() );			
			//System.out.println(enlaces);
			Element enlace = null;
			String  urlSalto = null;
			
			for ( int i=0; i < enlaces.size(); i++ ){
				enlace = enlaces.get(i);
				urlSalto = enlace.attr("href");
				//System.out.println(urlSalto);
				if ( urlSalto != null && !"".equals(urlSalto) ){
					
					doc = Jsoup.connect(urlSalto).get();
					titlePagina = doc.title();
					System.out.println("    Title= " + titlePagina );
					
				}else{
					System.out.println("   *No se ha encontrado la url");
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();			
		}catch (Exception e) {
			e.printStackTrace();
		}
				
		System.out.println("Terminamos parseo");

	}

}
