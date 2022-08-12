import java.util.Scanner;
public class myClass { 
    public static void main(String[] args) { 
        Scanner inpt= new Scanner(System.in);
        int base=inpt.nextInt();
        int mynum=inpt.nextInt();
        int result=powerTo(base,mynum);
        System.out.printf("%d",result);
    } 
    //recursive functin to calculate b raised to the power p
    static int powerTo(int b,int p)
    {
        if(p==0)
                return 1;
            else 
                return (b*powerTo(b,p-1));    
    }    
}

