package RechnenV1_2;

import java.io.IOException;
import java.util.*;

public class difficulty{
  public static int[][] easy(int m, int[][] richtige, int negZahlen) throws IOException{
    Random r = new Random();
    int num1 = 0, num2 = 0, erg = 0, zeichen, aw = 0;
    for (int i = 0;i<m;i++) {
      num1 = erzeugen.eins(num1);
      num2 = erzeugen.zwei(num2);
      zeichen =  r.nextInt(2);
      switch (zeichen) {
        case 0 : 
          richtige = methoden.add(num1,num2,erg,aw,richtige,negZahlen,i,m);
          break;
        case 1 : 
          richtige = methoden.sub(num1,num2,erg,aw,richtige,negZahlen,i,m);
          break;
        default: 
          System.out.println("");
      } // end of switch
      
    } // end of for
    return richtige;
  }
  public static int[][] norm(int m, int[][] richtige, int negZahlen) throws IOException{
    Random r = new Random();
    int num1 = 0, num2 = 0, erg = 0, zeichen, aw = 0;
    for (int i = 0;i<m;i++) {
      num1 = erzeugen.eins(num1);
      num2 = erzeugen.zwei(num2);
      zeichen =  r.nextInt(4);
      switch (zeichen) {
        case 0 : 
          richtige = methoden.add(num1,num2,erg,aw,richtige,negZahlen,i,m);
          break;
        case 1 : 
          richtige = methoden.sub(num1,num2,erg,aw,richtige,negZahlen,i,m);
          break;
        case 2 :
          richtige = methoden.mul(num1,num2,erg,aw,richtige,negZahlen,i,m);
          break;
        case 3 :
          richtige = methoden.div(num1,num2,erg,aw,richtige,negZahlen,i,m);
          break;
        default: 
          System.out.println("");
      } // end of switch
      
    } // end of for
    return richtige;
  }
  public static int[][] hard(int m, int[][] richtige, int negZahlen) throws IOException{
    Random r = new Random();
    
    int num1 = 0, num2 = 0, erg = 0, zeichen, aw = 0;
    for (int i = 0;i<m;i++) {
      num1 = erzeugen.eins(num1);
      num2 = erzeugen.zwei(num2);
      zeichen =  r.nextInt(4);
      switch (zeichen) {
        case 0 : 
          richtige = methoden.add(num1,num2,erg,aw,richtige,negZahlen,i,m);
          break;
        case 1 : 
          richtige = methoden.sub(num1,num2,erg,aw,richtige,negZahlen,i,m);
          break;
        case 2 :
          richtige = methoden.mul(num1,num2,erg,aw,richtige,negZahlen,i,m);
          break;
        case 3 :
          richtige = methoden.div(num1,num2,erg,aw,richtige,negZahlen,i,m);
          break;
        default: 
          System.out.println("");
      } // end of switch
      
    } // end of for
    return richtige;
  }
}