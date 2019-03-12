package string.analyzer;
/*Task 7
Show examples of the following methods of the String class. Try to  cover as several possible usages/example for each of these methods.
7a) CompareTo(s1.compareTo(s2) means 1st word num-2nd num)
*/
import java.util.Scanner;
public class STRING_COMPARETO{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter tour sample input");//"muhaiminur"
    String x=abir.nextLine();
    String y="muhaiminur rahman";
    String z="abiraa";
    System.out.println(x.compareTo(y));//-7
    System.out.println(y.compareTo(x));//7
    System.out.println(y.compareTo(z));//1st word betwen this m(109)-a(97=12
    System.out.println("def".compareTo("abc"));//3
  }
}