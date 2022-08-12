import java.util.Scanner;
import java.lang.Math;
public class myClass1 {
  public static void main(String[] args){
  	Scanner myInput= new Scanner(System.in);
  	//farenheigh to celcius
    System.out.print("enter temperature in degree Farenheight: ");
    float DegreesF=myInput.nextInt();
    float DegreesC = 5*(DegreesF - 32)/9;
    System.out.printf("temperature in degree celcius is: %.02f",DegreesC);
    //binary to decimal
    System.out.print("\nenter a 4 digit binary number: ");
    int bin_num=myInput.nextInt();
    int bin2dec=0;
    bin2dec=bin2dec+(bin_num%10)*1; bin_num=bin_num/10;
    bin2dec=bin2dec+(bin_num%10)*2; bin_num=bin_num/10;
    bin2dec=bin2dec+(bin_num%10)*4; bin_num=bin_num/10;
    bin2dec=bin2dec+(bin_num%10)*8; 
    System.out.print("binary to decimal is: "+bin2dec);
    //4 digit integer displayed vertically
    System.out.print("\nenter a 4 digit integer: ");
    int myint=myInput.nextInt();
    int d=myint%10; myint=myint/10;
    int c=myint%10; myint=myint/10;
    int b=myint%10; myint=myint/10;
    int a=myint;
    System.out.print("integer printed vertically\n");
    System.out.print(a+"\n"+b+"\n"+c+"\n"+d);
    //price tendered
    System.out.print("\nenter price in cents: ");
    int price=myInput.nextInt();
    System.out.print("enter tendered price in cents: ");
    int tendprice=myInput.nextInt();
    System.out.print("change amount in Quarters: "+(price-tendprice)*25);
    System.out.print("\nchange amount in Dimes: "+(price-tendprice)*10);
    System.out.print("\nchange amount in Nickels: "+(price-tendprice)*5);
    System.out.print("\nchange amount in Pennies: "+(price-tendprice));
  }
}