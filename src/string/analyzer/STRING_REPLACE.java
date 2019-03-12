package string.analyzer;
/*7j) replace(char oldChar, char newChar) */
import java.util.Scanner;
public class STRING_REPLACE{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter tour sample input");//"abir"
    String x=abir.nextLine();
    String y="abir";
    String z="alol";
    String m="abirjihman";
    System.out.println(x.replace('a','m'));//mbir
    System.out.println(y.replace('a','8'));//8bir
    System.out.println(z.replace('j','a'));//alol
  }
}