package SumarTamanio;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class EscribirExcel {
	
	public static void escribirExccel() throws IOException{
	
	// Se crea el libro
		
		HSSFWorkbook libro = new HSSFWorkbook();

    // Se crea una hoja dentro del libro

		HSSFSheet hoja = libro.getSheet("C:/Users/abana62/Desktop/1.xls");
		
		System.out.println(hoja);
    // Se crea una fila dentro de la hoja
		
	// Introducir la en numero de la fila en el que se quiere escribir

		HSSFRow fila = hoja.createRow(9);
		HSSFRow fila1 = hoja.createRow(8);
		HSSFRow fila2= hoja.createRow(10);
		HSSFRow fila3 = hoja.createRow(11);
    // Se crea una celda dentro de la fila
		
	//introducir el numero de celda en el que se quiere escribir	

		HSSFCell celda = fila.createCell((short) 7);
		HSSFCell celda1 = fila.createCell((short) 8);
		HSSFCell celda2 = fila.createCell((short) 9);
		HSSFCell celda3 = fila.createCell((short) 10);
		HSSFCell celda4 = fila.createCell((short) 11);
		

    // Se crea el contenido de la celda y se mete en ella.

		HSSFRichTextString texto = new HSSFRichTextString("SE PUEDE PONER ALGO PARA ESCRIBIR");

		celda.setCellValue("Peso archivo");
		celda1.setCellValue(CalcularTamanio.calcularPesoVariosPdf());
		celda2.setCellValue("Numero archivos");
		celda3.setCellValue(CalcularTamanio.obtenerNumeroFicheros(Main.RUTA));
		celda4.setCellValue("hola");
		

    // Se salva el libro.

    try {

        FileOutputStream elFichero = new FileOutputStream(Main.RUTACREAREXCEL);

        libro.write(elFichero);

        elFichero.close();

    } catch (Exception e) {

        e.printStackTrace();

    }

	}
}
