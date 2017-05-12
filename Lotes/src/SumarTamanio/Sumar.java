package SumarTamanio;

import java.io.File;
import java.io.IOException;
import javax.swing.text.PlainDocument;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;



public class Sumar {
	
	////// METODO PARA SUMAR LOS PESOS DE LOS ARCHIVOS EXISTENTES EN UNA RUTA
	public static double suma (String ruta) throws IOException
	{
		double sum=0;
		String pdf="pdf";
		String linea=null;
		String sublinea;
		String files;
		

		File fichero = new File(ruta);
		PlainDocument pd = null;
		
		int nLineas=CalcularTamanio.obtenerNumeroFicheros(ruta);		
			     
		 File folder = new File(ruta);
		 File[] listOfFiles = folder.listFiles(); 
		 
		 for (int i = 0; i < listOfFiles.length; i++)         
		 {

		        if (listOfFiles[i].isFile())            
		        {
		            files = listOfFiles[i].getName();
		          
		            sublinea=files.substring(files.length()-3);
		            if(sublinea.equalsIgnoreCase(pdf))
		            {
		            	String rutapdf=ruta+files;
		                sum=sum+CalcularTamanio.calcularPeso(rutapdf);
		            }
		            
		        }
		 }
		
		return sum;
	
	 }
	
	//////// METODO PARA LEER FICHEROS DADA UNA RUTA
	
     public static void leeFfichero(String ruta)
     {
         
    	 String files;
         File folder = new File(ruta);
         File[] listOfFiles = folder.listFiles(); 
 
         for (int i = 0; i < listOfFiles.length; i++)        
         {

        	 if (listOfFiles[i].isFile())           
        	 {
        		 files = listOfFiles[i].getName();
        		 
             }
         }
     }
 
}
