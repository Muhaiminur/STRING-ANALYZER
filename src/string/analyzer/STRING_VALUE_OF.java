package string.analyzer;
/*7p) valueOf*/
import java.util.Scanner;
public class STRING_VALUE_OF{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter tour sample input");//"abir"
    String x=abir.nextLine();
    String y="abir";
    String z=String.valueOf(123);
    z=z+"abir";
    int m=2013;
    m=m+Integer.valueOf("1");
    Double n=2024.0;
    n=n+Double.valueOf("100");
    System.out.println(x.valueOf(y));//tranfer the format//abir
    System.out.println(y.valueOf(z));//123abir
    System.out.println(x.valueOf(m));//2014
    System.out.println(x.valueOf(n));//2124.0
  }
}