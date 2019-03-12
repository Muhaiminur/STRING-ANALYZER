package string.analyzer;
/*7g) indexOf*/
import java.util.Scanner;
public class STRING_INDEX0F{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter tour sample input");//"muhaiminur rahman"
    String x=abir.nextLine();
    String y="rahman";
    String z="muhaiminurrahman abir";
    System.out.println(x.indexOf(y));//11
    System.out.println(y.indexOf("a"));//1
    System.out.println(z.indexOf('a',5));//3 means it searc after 3 words//11
  }
}