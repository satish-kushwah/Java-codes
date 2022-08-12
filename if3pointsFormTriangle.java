import java.util.Scanner;
import java.lang.Math; 
public class myclass {
    public static boolean verify_input (int point1_x, int point1_y,
        int point2_x, int point2_y,
        int point3_x, int point3_y)
    {   //checking if all coordinates  are positive
        if(point1_x<0||point1_y<0||point2_x<0||point2_y<0||point3_x<0||point3_y<0)
            return(false);
        //checking if all pints lies in 40*40 grid
        else if(point1_x>40||point1_y>40||point2_x>40||point2_y>40||point3_x>40||point3_y>40)
            return(false);
        //checkig if the points form line
        else if((point2_y - point1_y )*(point3_x - point1_x)==(point2_x - point1_x)*(point3_y - point1_y))
            return(false);
        //if all condition met return true
        else
            return(true);
    } 
    public static void main(String[] args) {
        boolean flag;
        String choice;
        Scanner scan= new Scanner(System.in);
        int x1,y1,x2,y2,x3,y3;
        while(true){
            System.out.printf("Please enter the x-coordinate of point1: ");
            x1=scan.nextInt();
            System.out.printf("Please enter the y-coordinate of point1: ");
            y1=scan.nextInt();
            System.out.printf("Please enter the x-coordinate of point2: ");
            x2=scan.nextInt();
            System.out.printf("Please enter the y-coordinate of point2: ");
            y2=scan.nextInt();
            System.out.printf("Please enter the x-coordinate of point3: ");
            x3=scan.nextInt();
            System.out.printf("Please enter the y-coordinate of point3: ");
            y3=scan.nextInt();
            flag=verify_input(x1,y1,x2,y2,x3,y3); //verifying input
            if(flag==false)
                System.out.println("Invalid input");
            else  
                System.out.format("The perimeter of a Triangle with point1 (%d, %d), point2 (%d, %d) and point3 (%d, %d) is %f\n",x1,y1,
                x2,y2,x3,y3,Math.sqrt((y2-y1)*(y2-y1)+(x2-x1)*(x2-x1))+Math.sqrt((y2-y3)*(y2-y3)+(x2-x3)*(x2-x3))+Math.sqrt((y3-y1)*(y3-y1)+(x3-x1)*(x3-x1)));
            System.out.printf("Would you like to repeat the program? ");
            choice=scan.next();
            if(choice.equals("yes")||choice.equals("Yes"))
                continue;
            else 
                break;
        }
    }    
}