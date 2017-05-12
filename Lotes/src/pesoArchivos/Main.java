package pesoArchivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Main {

	static final String RUTA =CalcularTamanio.pedirRuta();
	
	/////RUTACREAREXCEL es donde queremos que se copie el archivo excel.
	
	static final String RUTACREAREXCEL = "C:/Users/abana62/Desktop/";
			
	//"C:/Users/abana62/Desktop/LOTE_0/6245/"
	

	public static void main(String[] args) throws IOException {
	
		ModificarExcel.modificarExcel(5, 5);
//		EscribirExcel.escribirExccel();
		
	}

}	





