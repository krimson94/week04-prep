import java.util.Scanner;

public class WordFrequencies {
   public static void main(String[] args) {
      Scanner scnr =  new Scanner(System.in);
      int numInteger;
      int wordCount = 0;
      
      System.out.println("Enter number of words to input: ");
      numInteger = scnr.nextInt();
      
      String[] userWords = new String[numInteger];
      for (int i = 0; i < userWords.length; i++)   {
          System.out.print("Enter word: "); 
          userWords[i] = scnr.next();
      }
      
      for (int i = 0; i < userWords.length; i++)   {
          wordCount = 0;                              
          for (int j = 0; j < userWords.length; j++) { 
              if (userWords[j].equals(userWords[i]))   {  
              wordCount+=1;
              }
          }
          
          System.out.print(userWords[i] + " - ");
          System.out.println(wordCount);
      }
      scnr.close();
   }
}