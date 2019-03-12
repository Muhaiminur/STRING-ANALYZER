package string.analyzer;
/*7l) toCharArray*/
import java.util.Scanner;
public class STRING_TO_CHARARRAY{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter tour sample input");//"abir"
    String x=abir.nextLine();
    String y="abir";
    String z="alol";
    char[]a=z.toCharArray();
    System.out.println(x.toCharArray());//abir
    System.out.println(y.toCharArray());//abir
    System.out.println(a.length);//4
  }
}