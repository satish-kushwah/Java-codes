import java.util.Scanner;
public class bmi {
  public static void main(String[] args){
  	Scanner myInput= new Scanner(System.in);
    System.out.print("enter ur height in meters ");
    Double height=myInput.nextDouble();
    System.out.print("enter ur weight in kg ");
    int weight=myInput.nextInt();
    Double bmi=weight/(height*height);
    System.out.print("ur bmi is "+bmi);
  }//End of main
}