public class Challenge  { 
    public static void main(String[] args) { 
        //input variables
        int car1 = Integer.parseInt(args[0]); 
        int car2 = Integer.parseInt(args[1]);
        //speed stored in car1 and car2 variables
        //main code to decide number of fast cars 
        if (car1>70 && car2>70)
            System.out.printf("2 fast cars");
        else if(car1>70 || car2>70)
            System.out.printf("1 fast car");
        else
            System.out.printf("no fast car");
    }
}
