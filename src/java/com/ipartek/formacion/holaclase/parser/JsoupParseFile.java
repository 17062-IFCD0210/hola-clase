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


public class JsoupParseFile {

	static final String URL ="https://www.youtube.com/watch?v=jYRvACrJ9O4";// "https://www.surfsearchspot.com/";//"http://example.com/"; // URL a parsear
	
	 //Escribimos la ruta y el nombre del fichero
	static String ruta = "Z:\\Javi\\Documents\\CURSO\\";
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

				titlePagina = doc.title();
				System.out.println("Title = "+ titlePagina);
			
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
