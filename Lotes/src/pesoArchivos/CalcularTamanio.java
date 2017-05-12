package pesoArchivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class CalcularTamanio {
	
	////////// METODO PARA CALCULAR EL PESO DE LOS PDFS DE LA RUTA QUE SE ESPECIFIQUE
	
	public static double calcularPesoVariosPdf () throws IOException{
		 
		 
		int n=CalcularTamanio.obtenerNumeroFicheros(Main.RUTA);
		
			System.out.println("El numero de ficheros en esta ruta es " +n);
		 
		//double t= CalcularTamanio.calcularPeso(RUTA);
		
			System.out.println(" ");
		 
		double sum=Sumar.suma(Main.RUTA);
		
			System.out.println("La suma de todos los archivos de la ruta es "+sum+ " mB");
		
		
		return sum;
		
	}
	/////METODO PARA CALCULAR EL PESO DE CADA FICHERO
	
	public static double calcularPeso(String fichero) {
		double peso_pdf = 0;
		long peso_pdf_bytes = 0;
			
		File f = new File(fichero);
		
		if(f.exists())
		{
		
			peso_pdf_bytes = f.length();
		
			peso_pdf = peso_pdf_bytes/1048576.0;
			
			peso_pdf = Math.round( peso_pdf * 100.0 ) / 100.0;
		}
		else
		{
			System.out.println("NO SE HA ENCONTRADO NINGUN FICHERO");
		}
		

		return peso_pdf;
	}
	
	/////// METODO PARA OBTENER EL NUMERO DE FICHEROS DADA UNA RUTA
	
	public static int obtenerNumeroFicheros (String ruta)
	{
		int numFicheros = 0;
		File directorio = new File(ruta);
		
		if(directorio.exists())
		{
			File[] lista_ficheros = directorio.listFiles();
			if (lista_ficheros != null)
			{
				for(int i = 0; i < lista_ficheros.length; i++)
				{
					if(lista_ficheros[i].isDirectory())
					{
						int num = obtenerNumeroFicheros(lista_ficheros[i].getAbsolutePath());
						numFicheros += num;
					}
					else if(lista_ficheros[i].isFile())
					{
						numFicheros++;
					}
				}
			}
		}
		else
		{
			System.out.println("ERROR: Ruta de directorio incorrecta");
		}
		
		return numFicheros;
	}

	public static String pedirRuta ()
	{
		String ruta = JOptionPane.showInputDialog("Introduce la ruta del lote");
		JOptionPane.showMessageDialog(null, "La ruta  ingresada es: "+ ruta);
		
		
		return ruta;
		
	}


}

