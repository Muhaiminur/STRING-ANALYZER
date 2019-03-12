package string.analyzer;
/*Task 6
Input a word into a String. 
Print the word.
Print the word again after adding �==THE END==� at the end of the word.
Then print the word again. 
Your whole program may contain the word �String� at most two times.
You HAVE TO to use concat method. 
You are NOT allowed use �+� operator to concatenate (join?) words. 
Sample input 1:
Programming
Sample output 1:
Programming
Programming==THE END==
Programming


Sample input 2:
hunger
Sample output 2:
hunger
hunger==THE END==
hunger
*/
import java.util.Scanner;
public class STRING_CONCATE{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter tour sample input");
    String x=abir.nextLine();
    System.out.println("Sample input 1:");
    System.out.println(x);
    System.out.println("Sample output 1:");
    System.out.println(x);
    System.out.println((x.concat("==THE END==")));
    System.out.println(x);
  }
}
    