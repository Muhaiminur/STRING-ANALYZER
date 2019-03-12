package string.analyzer;
/*7n) toUpperCase*/
import java.util.Scanner;
public class STRING_TO_UPPERCASE{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter tour sample input");//"abir"
    String x=abir.nextLine();
    String y="abir";
    String z="alol";
    System.out.println(x.toUpperCase());//ABIR
    System.out.println(y.toUpperCase());//ABIR
  }
}