package RechnenV1_2;

import java.text.SimpleDateFormat;
import java.util.*;

public class erzeugen {
  public static int eins(int num1){
    Random r = new Random();
    num1 = r.nextInt(10);
    return num1;
  }
  
  public static int zwei(int num2){
    Random r = new Random();
    num2 = r.nextInt(10);
    return num2;
  }
  
  public static String zeit(String time){
	  SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");
	  time = sdfTime.format(new Date());
	  return time;
  }
  
  public static String datum(String date){
	  SimpleDateFormat sdfDate = new SimpleDateFormat("dd:MM:yyyy");
	  date = sdfDate.format(new Date());
	  return date;
  }
}
