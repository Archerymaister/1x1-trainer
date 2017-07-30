package RechnenV1_2;

import java.io.IOException;
import java.util.*;

public class methoden{
  public static int[][] add(int num1, int num2, int erg, int aw, int[][] richtige, int negZahlen,int i,int m) throws IOException{
    Scanner s = new Scanner(System.in);
    String Zeichen = " + ";
    erg = num1 + num2;
    System.out.print(num1 + " + " + num2 + " = ");
    aw = s.nextInt();
    
    if (aw == erg) {
      richtige[i][0] = erg;
      richtige[i][1] = 1;
    }
    else{
      richtige[i][0] = erg;
      richtige[i][1] = 0;
    }
    documents.write(num1, num2, erg, aw, Zeichen);
    return richtige;
  }
  
  public static int[][] sub(int num1, int num2, int erg, int aw, int[][] richtige, int negZahlen,int i,int m) throws IOException{
    Scanner s = new Scanner(System.in);
    String Zeichen = " + ";
    erg = num1 - num2;
    while(negZahlen == 0 && erg < 0){
      num1 = erzeugen.eins(num1);
      num2 = erzeugen.zwei(num2);
      erg = num1 - num2;
    }
    System.out.print(num1 + " - " + num2 + " = ");
    aw = s.nextInt();
    
    if (aw == erg) {
      richtige[i][0] = erg;
      richtige[i][1] = 1;
    }
    else{
      richtige[i][0] = erg;
      richtige[i][1] = 0;
    }
    documents.write(num1, num2, erg, aw, Zeichen);
    return richtige;
  }
  
  public static int[][] mul(int num1, int num2, int erg, int aw, int[][] richtige, int negZahlen,int i,int m) throws IOException{
    Scanner s = new Scanner(System.in);
    String Zeichen = " + ";
    erg = num1 * num2;
    
    System.out.print(num1 + " · " + num2 + " = ");
    aw = s.nextInt();
    
    if (aw == erg) {
      richtige[i][0] = erg;
      richtige[i][1] = 1;
    }
    else{
      richtige[i][0] = erg;
      richtige[i][1] = 0;
    }
    documents.write(num1, num2, erg, aw, Zeichen);
    return richtige;
    
  }
  
  public static int[][] div(int num1, int num2, int erg, int aw, int[][] richtige, int negZahlen,int i,int m) throws IOException{
    Scanner s = new Scanner(System.in);
    String Zeichen = " + ";
    while (num2 == 0) {
      num2 = erzeugen.zwei(num2);
    } // end of if
    
    erg = (int) num1 / num2;
    
    
    System.out.print(num1 + " ÷ " + num2 + " = ");
    aw = s.nextInt();
    
    
    if (aw == erg) {
      richtige[i][0] = erg;
      richtige[i][1] = 1;
    }
    else{
      richtige[i][0] = erg;
      richtige[i][1] = 0;
    }
    documents.write(num1, num2, erg, aw, Zeichen);
    return richtige;
  }
}