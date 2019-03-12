package string.analyzer;
/*7m) toLowerCase*/
import java.util.Scanner;
public class STRING_TOLOWERCASE{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter tour sample input");//"abir"
    String x=abir.nextLine();
    String y="RAHMANaA";
    String z="alol";
    System.out.println(x.toLowerCase());//abir
    System.out.println(y.toLowerCase());//rahmanaa
  }
}