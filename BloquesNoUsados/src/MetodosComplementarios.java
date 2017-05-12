import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class MetodosComplementarios {
	
	
	
	///////////////////// METODO PARA INTRODUCIR LA RUTA DEL ARCHIVO A MODIFICAR  
	
	public static String introducirRuta ()
	{
	
		String rutaArchivo = JOptionPane.showInputDialog("Ingrese la ruta del archivo: ");
		JOptionPane.showMessageDialog(null, "La ruta  ingresad es: "+ rutaArchivo);
	
		return rutaArchivo;
			
	}
	
	/////////////////////////METODO PARA DARLE NOMBRE AL ARCHIVO
	
	public static String nombraArchivo ()
	{
		String nombreArchivo = JOptionPane.showInputDialog("Nombre el archivo de Mets repetidos, por favor termine con la extension .txt ");
	
		return nombreArchivo;
		
	}

	//////////METODO PARA CONTAR LINEAS DE UN FICHERO

	public static int  contarLineas (String archivo) throws IOException
	{  

		int numeroLineas=0;
		String Cadena =null;

		FileReader fr=new FileReader(archivo);
		BufferedReader bf=new BufferedReader(fr);


		while  ((Cadena=bf.readLine())!=null)

			{numeroLineas++;}

			System.out.println("El numero de lineas del fichero "+numeroLineas);

			return numeroLineas;

}

	
}
