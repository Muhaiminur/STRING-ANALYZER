package string.analyzer;
/*7f) equalsIgnoreCase*/
import java.util.Scanner;
public class STRING_EQUAL_IGNORE_CASE{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter tour sample input");//"abir"
    String x=abir.nextLine();
    String y="abir";
    String z="AbIR";
    String m="abirjihman";
    System.out.println(x.equalsIgnoreCase(y));//true
    System.out.println(y.equalsIgnoreCase(z));//true
    System.out.println(z.equalsIgnoreCase(m));//false
  }
}