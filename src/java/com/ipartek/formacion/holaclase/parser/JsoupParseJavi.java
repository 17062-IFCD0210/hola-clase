package com.ipartek.formacion.holaclase.parser;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;




import java.io.File; //para crear el archivo
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter; //para abrir el archivo
import java.io.PrintWriter; //para escribir en el archivo


public class JsoupParseJavi {

	static final String URL = "https://www.surfsearchspot.com/";//"http://example.com/"; // URL a parsear
	
	 //Escribimos la ruta y el nombre del fichero
	static String ruta = "c:\\desarrollo\\";
	static String nombre = "archivoHTML.txt";
	
	
	public static void main(String[] args) {
		System.out.println("Comenzamos parseo "+ URL);
		
		Document doc;
		String titlePagina = "";
		
		//Creamos un objeto con los valores anteriores
		File archivo = new File(ruta, nombre);
				
		if (archivo.exists()){
			//TODO cargar del DD
			FileReader fr;
			try {
				fr = new FileReader(ruta+nombre);
				System.out.println("Archivo encontrado");
				
				fr.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e){
	            System.out.println("Error E/S: "+e);
			}
			
		}else{
			try {
				
				//Creamos el archivo en el disco
				archivo.createNewFile();
				FileWriter fw = new FileWriter(archivo);
				PrintWriter pw = new PrintWriter(fw);
				   		   
			    
				doc = Jsoup.connect(URL).get();
				System.out.println("Conectado");
				
				//Escribe en el fichero
				pw.println(doc.html());

				//obtener el codigo fuente
				//System.out.println(doc.html());
				
				titlePagina = doc.title();
				System.out.println("Title = "+ titlePagina);
/*				
				Elements enlaces = doc.getElementsByTag("a");
				System.out.println("Enlaces encontrados = " + enlaces.size());
				
				//System.out.println(enlaces);
				
				Element enlace = null;
				String urlSalto = null;
				for (int i=0;i<enlaces.size();i++){
					
					enlace = enlaces.get(i);
					urlSalto = enlace.attr("href");
					//System.out.println(urlSalto);
					
					if( urlSalto !=null && !"".equals(urlSalto)){
						doc = Jsoup.connect(urlSalto).get();		
						titlePagina = doc.title();
						System.out.println("    Title = "+ titlePagina);							
					}else{
						System.out.println("    *No se ha encontrado la url");	
					}
				}
*/				
				//cerramos los objetos
			    pw.close();
			    fw.close();
	
				
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e){
				e.printStackTrace();
			}
		}
		System.out.println("Terminamos parseo");

	}

}
