import java.util.*; 
import java.io.*;

class Main {  
  public static String AlphabetSoup(String str) { 
  
    // convert input string to char array 
        char tempArray[] = str.toCharArray(); 
          
        // sort tempArray 
        Arrays.sort(tempArray); 
          
        // return new sorted string 
        return new String(tempArray);
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(AlphabetSoup(s.nextLine())); 
  }   
  
}
