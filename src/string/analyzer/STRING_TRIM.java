package string.analyzer;
/*7o) trim*/
import java.util.Scanner;
public class STRING_TRIM{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter tour sample input");//"     abir      "
    String x=abir.nextLine();
    String y="abir";
    String z="      abir    ";
    System.out.println(x.trim());//abir
    System.out.println(z);//      abir    
    System.out.println(z.trim());//remove space//abir
  }
}