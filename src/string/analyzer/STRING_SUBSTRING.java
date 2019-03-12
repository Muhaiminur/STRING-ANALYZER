package string.analyzer;
/*7k) substring*/
import java.util.Scanner;
public class STRING_SUBSTRING{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter tour sample input");//"abir"
    String x=abir.nextLine();
    String y="abir";
    String z="MUHAIMINUR RAHMAN ABIR";
    System.out.println(x.substring(2));//ir
    System.out.println(y.substring(2,3));//i
    System.out.println(z.substring(11,17));//RAHMAN
  }
}