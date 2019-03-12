package string.analyzer;
/*7h) lastIndexOf*/
import java.util.Scanner;
public class STRING_LAST_INDEXOF{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter tour sample input");//"abir"
    String x=abir.nextLine();
    String y="abir";
    String z="alol";
    System.out.println(x.lastIndexOf('b'));//1
    System.out.println(y.lastIndexOf(3));//-1
  }
}