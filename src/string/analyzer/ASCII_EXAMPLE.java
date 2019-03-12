package string.analyzer;
/* Now your task is to input a word into a String. Then print code for each character in the String using the 2nd method discussed above. Use any means necessary.
Sample input 1:
Programming
Sample output 1:
P : 80
r : 114
o : 111
g : 103
r : 114
a : 97
m : 109
m : 109
i : 105
n : 110
g : 103 
Sample input 2:
hunger
Sample output 2:
h : 104
u : 117
n : 110
g : 103
e : 101
r : 114*/
import java.util.Scanner;
public class ASCII_EXAMPLE{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter tour sample input");
    String x=abir.nextLine();
    System.out.println("Sample input 1:");
    System.out.println(x);
    System.out.println("Sample output 1:");
    int c=0;
    while(c<x.length()){
      System.out.println(x.charAt(c)+"::"+x.codePointAt(c));
      c++;
    }
  }
}