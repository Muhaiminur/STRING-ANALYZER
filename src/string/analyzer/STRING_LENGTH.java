package string.analyzer;
/*Task 1
Input a word into a String. Print the length of the word, that is, how many characters / symbols / spaces are there. Take help from: 
Sample input 1:
Programming
Sample output 1:
11

Sample input 2:
hunger
Sample output 2:
6
*/
import java.util.Scanner;
public class STRING_LENGTH{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter our sample input");
    String x=abir.nextLine();
    System.out.println("Sample input 1:");
    System.out.println(x);
    System.out.println("Sample output 1:");
    System.out.println(x.length());
  }
}