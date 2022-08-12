import java.util.Scanner;
public class CountOccurances {
    public static void Count(int size, int[] array){
        for(int i=0;i<size;i++){
            int count=0;
            int val=array[i];
            for (int j=i;j<size ;j++ ) {
                if(val!=0 && array[j]==val){
                    count=count+1;
                    array[j]=0; //setting counted values to  0
                }
            }    
            if(count==1)
                System.out.println(val+" occured 1 time");
            else if(count>1)
                System.out.println(val+" occured "+count+" times");
        }
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int array[],x,i=0;
        array=new int[10];
        System.out.print("Enter up to 10 integers between 1 and 100 (0 to stop): ");
        while(i<10) {
            if(scan.hasNextInt()){
                x=scan.nextInt();
                if(x==0)
                    break;
                else if(x>=1 && x<=100){
                    array[i]=x;
                    i=i+1;
                }
            }
        }
        Count(i,array); //calling Count method, and passing size of array and array
    }    
}

