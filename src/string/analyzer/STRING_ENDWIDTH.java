package string.analyzer;
/*7d) endsWith*/
import java.util.Scanner;
public class STRING_ENDWIDTH{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter tour sample input");//"muhaiminur rahman"
    String x=abir.nextLine();
    String y="rahman";
    String z="muhaiminur rahman mabir";
    String m="muhaiminur rahman abir";
    System.out.println(x.endsWith(y));//true
    System.out.println(y.endsWith(z));//false
    System.out.println(m.endsWith("abir"));//true
  }
}