package string.analyzer;
/*7e) equals(*/
import java.util.Scanner;
public class STRING_EQUALS{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter tour sample input");//"abir"
    String x=abir.nextLine();
    String y="abir";
    String z="AbiR";
    String m="abirjihman";
    System.out.println(x.equals(y));//true
    System.out.println(y.equals(z));//true
    System.out.println(z.equals(m));//false
  }
}