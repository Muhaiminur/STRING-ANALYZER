package string.analyzer;
/*7c) startsWith(s2.startsWith(s1) means both word will be start same.(t/f))*/
import java.util.Scanner;
public class STRING_STARTWIDTH{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter tour sample input");//"muhaiminur rahman"
    String x=abir.nextLine();
    String y="muhaiminur";
    String z="mabir";
    String m="muhaiminur rahman abir";
    System.out.println(x.startsWith(y));//true
    System.out.println(y.startsWith(z));//false
    System.out.println(m.startsWith("abir",18));//true
    System.out.println(m.startsWith("abir"));//false
    System.out.println(m.startsWith("MUHAI"));//false
    System.out.println(m.startsWith("muhai"));//true
  }
}