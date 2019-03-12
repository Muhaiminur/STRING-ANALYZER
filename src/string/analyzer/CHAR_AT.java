package string.analyzer;
/*Task 2
Input a word into a String. Print each character on a line by itself.  Use charAt method.
Sample input 1:
Programming
Sample output 1:
P
r
o
g
r
a
m
m
i
n
g


Sample input 2:
hunger
Sample output 2:
h
u
n
g
e
r
*/
import java.util.Scanner;
public class CHAR_AT{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter tour sample input");
    String x=abir.nextLine();
    System.out.println("Sample input 1:");
    System.out.println(x);
    System.out.println("Sample output 1:");
    int c=0;
    while(c<x.length()){
      System.out.println(x.charAt(c));
      c++;
    }
  }
}