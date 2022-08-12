import java.util.Scanner;
public class myclass {
    public static double squareRoot(double a){
    double e = 0.0001; //define the precision of your result
    double s = a/2; //initial guess
    while (((s - a / s)/2) > e){
        s = (s + a / s) / 2;
        }
    return s;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double n;
        System.out.printf("enter number to get sqrt: ");
        n=scan.nextDouble(); 
        System.out.printf("sqrt of "+n+" is "+squareRoot(n));
    }    
}

