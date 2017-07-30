package RechnenV1_2;

import java.util.*;
import java.io.*;


public class exe{
  public static void main(String[] args) throws IOException{
    int diff,mengeAufgaben, negZahlen = 0,anzRichtige = 0, percent;
    int[][]richtige;
    double version = 1.2;
    String antw = "N";
    Scanner s = new Scanner(System.in);
    
    documents.gen();			//log file erstellen
    documents.writeHead();		//log file beschreiben
    
    System.out.println("Version " + version);
    System.out.print("Schwierigkeitsgrad (1-3): ");
    diff = s.nextInt();
    if (diff != 4) {
      System.out.print("Anzahl der Aufgaben: ");
      mengeAufgaben = s.nextInt();
      richtige = new int[mengeAufgaben][2];
      System.out.print("Mit negativen Zahlen? (J)a / (N)ein -> ");
      antw = s.next();
    }
    else{
      mengeAufgaben = 4;
      richtige = new int[4][2];
      negZahlen = 1;
    }
    if(antw.equals("j")||antw.equals("J")){
    	negZahlen = 1;	
    }
    
    System.out.println("+---------------------+");
    
    switch (diff) {
      case 1 :
        richtige = difficulty.easy(mengeAufgaben,richtige,negZahlen);
        break;
      case 2 :
        richtige = difficulty.norm(mengeAufgaben,richtige,negZahlen);
        break;
      case 3 :
        richtige = difficulty.hard(mengeAufgaben,richtige,negZahlen);
        break;
      case 4 :
        System.out.println("\nWartungsmodus!\n");
        richtige = methoden.add(4,2,0,0,richtige,0,0,4);
        richtige = methoden.sub(4,2,0,0,richtige,0,1,4);
        richtige = methoden.mul(4,2,0,0,richtige,0,2,4);
        richtige = methoden.div(4,2,0,0,richtige,0,3,4);
        break;
      case 5 :
    	documents.write(1, 1, 1, 1, " ");  
      break;  
      default:
        System.out.println("Fehler");
    }
    
    for (int i = 0;i<mengeAufgaben;i++) {
      if(richtige[i][1] == 1){
        anzRichtige++;
      }
    } // end of for
    
    percent =  (anzRichtige*100)/mengeAufgaben;
    
    System.out.println("+---------------------+");
    System.out.println("Du hast "+ anzRichtige +" von " + mengeAufgaben + " richtig.");
    
    if(percent < 20){
    	System.out.println("Das geht aber besser!");
    }else if(percent >= 20 && percent < 50){
    	System.out.println("Weiter üben und es wird besser!");
    }else if(percent >= 50 && percent < 80){
    	System.out.println("Du bist schon auf dem richtigen Weg!");
    }else if(percent >= 80 && percent < 100){
    	System.out.println("Fast perfekt, nur noch ein Bischen!");
    }else if(percent == 100){
    	System.out.println("Super! Alles richtig.");
    }
    
    System.out.print("Möchtest du eine genaue Auswertung? (J)a / (N)ein -> ");
    antw = s.next();
    System.out.println("+---------------------+");
    if (antw.equals("j")||antw.equals("J")) {
      for (int i = 0;i<mengeAufgaben;i++ ) {
        if (richtige[i][1] == 0) {
          System.out.println("Aufgabe " + (i+1) + " ist leider falsch. Richtig wäre: " + richtige[i][0]); 
        } 
        else{
          System.out.println("Aufgabe " + (i+1) + " ist richtig.");
        }
      } // end of for
      System.out.println("+---------------------+");
    } // end of if
    System.out.println("Danke fürs teilnehmen!");
  }
}