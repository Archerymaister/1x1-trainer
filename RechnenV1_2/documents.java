package RechnenV1_2;

import java.io.*;

public class documents {
	public static File folder = new File("assets");
	public static File log = new File("assets/log.txt");
	
	public static void gen() throws IOException{		
		if(!folder.exists()){
			folder.mkdirs();
			System.out.println("Ordner erstellt!");
		}
		
		if(!log.exists()){
			log.createNewFile();
			System.out.println("Datei erstellt!");
		}
	}
	
	public static void write(int num1, int num2, int erg, int aw, String zeichen) throws IOException{
		BufferedWriter writer;
		writer = new BufferedWriter(new FileWriter(log,true));
			
		writer.append("\r\n" + num1 + zeichen + num2 + " = " + erg + "            Geantwortet wurde: " + aw);	
		
		writer.close();
		
	}
	public static void writeHead() throws IOException{
		String time = "hh:mm:ss", date = "dd:MM:yyyy";
		time = erzeugen.zeit(time);
		date = erzeugen.datum(date);
		BufferedWriter writer;
		writer = new BufferedWriter(new FileWriter(log,true));
		
		writer.append("\r\n\r\nAufgaben vom " + date + " um " + time + "\n");	
		
		writer.close();
	}

	
}
