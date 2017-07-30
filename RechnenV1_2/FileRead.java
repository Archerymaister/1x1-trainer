package RechnenV1_2;

import java.io.*;
import java.util.*;

public class FileRead {

   public static void main(String args[])throws IOException {
      File file = new File("ordner/Hello1.txt");
      Scanner s = new Scanner(System.in);
      String str;
      
      // creates the file
      file.createNewFile();
      
      // creates a FileWriter Object
      FileWriter writer = new FileWriter(file); 
      str = s.next();
      // Writes the content to the file
      if(str.startsWith("X:")){
    	 System.out.println("gefunden!!!"); 
      }
      
      
      
      
      writer.write(str + " \n"); 
      writer.flush();
      writer.close();

      // Creates a FileReader Object
      FileReader fr = new FileReader(file); 
      char [] a = new char[50];
      fr.read(a);   // reads the content to the array
      
      for(char c : a)
         System.out.print(c);   // prints the characters one by one
      fr.close();
   }
}
