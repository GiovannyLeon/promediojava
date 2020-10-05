package promedio_csv;
import java.io.*;

public class Promedio {

	public static final String delimiter = ",";
	   
	   public static void read(String csvFile) {        //funcion que lee el archivo y lo almacena
	      try {                                         //ejecuta aun con errores
	         File file = new File(csvFile);
	         FileReader fr = new FileReader(file);
	         BufferedReader br = new BufferedReader(fr);
	         String line = "";
	         String[] tempArr;
	         float promT = 0;                                        
	         int cont = 1;
	         while((line = br.readLine()) != null) {    //ciclo que separa los estudiantes
	        	 
	        	 float num = 0;
	        	 tempArr = line.split(delimiter);
	        	 for(int i = 2; i<=5;i++) {
	                num += Float.parseFloat(tempArr[i]);
	            }
	        	 
	          float promedio = num /4;                  //imprime el promedio de cada estudiante
	          System.out.println("Promedio estudiante "+cont+": "+promedio);
	          promT += promedio;
	          cont ++;
	         }
	         float promeTotal = promT / 19;             //promedio de toda la clase
	         System.out.println("Promedio total del salón es: "+promeTotal);
	         br.close();
	         
	         } catch(IOException ioe) {
	            ioe.printStackTrace();
	         }

	   }
	   
	   public static void main(String[] args) {        //ejecuta el programa
	      String csvFile = "C:\\Users\\Giovanny Andres Leon\\Desktop\\Promediojava\\archivocsv\\PromedioCSV.csv";
	      Promedio.read(csvFile);
	      
	   }
	}
