
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class InformeMets {
	
	/**
	 * 
	 * clase que se encarga de coger un fichero, hacer una copia, para
	 * ver los metadatos que se han repetido y crear un nuevo fichero limpio
	 * con solo los metadatos repetidos
	 * 
	 * HAY QUE CREAR 2 CARPETAS UNA PARA CADA UNA DE LAS RUTAS DE LAS CONSTANTES
	 * 
	 * C:/Users/ABANA55/Desktop/Id_Bloques_No_Usados_1943 - copia.txt
	 */
	
	
	//CONSTANTE PARA DAR LA RUTA DONDE GUARDAR EL ARCHIVO RESULTANTE DE METS
	static final String RUTAMETSREPETIDOS = "C:/Users/ABANA55/Desktop/Mets repetidos";
	static final String RUTACOPIAARCHIVO ="C:/Users/ABANA55/Desktop/copias de archivos Mets";
	static int index=0;
	
	public static void main(String[] args) throws IOException
	{
		 
		String copia =MetodosComplementarios.introducirRuta();
		ArrayList<String> linea=Archivos.leerFichero(copia,Archivos.copiaArchivo(copia));
		
		ArrayList<String> linea2=Archivos.leerFicheroFinal(linea);
		Archivos.imprimirNuevoFichero(linea2);
		
	}
	}

//fin clase

