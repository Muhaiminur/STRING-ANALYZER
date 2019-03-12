package string.analyzer;
/*7b) compareToIgnoreCase*/
import java.util.Scanner;
public class COMPARE_TO_IGNORE{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter tour sample input");//"abir"
    String x=abir.nextLine();
    String y="ABIRJI";
    String z="abirjihman";
    System.out.println(x.compareToIgnoreCase(y));//-2
    System.out.println(y.compareToIgnoreCase(z));//-4
  }
}