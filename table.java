//Programmed by: 
//Date Written:

public class Lab08Linda {
    //main function
    public static void main(String[] args) 
    {
        displayColumnHeaders();
        //passing Coke Data
        displaySaleWithDiscount("Coke",8,1.39,20);
        //passing Pepsi Data
        displaySaleWithDiscount("Pepsi",3,1.29,15);
        //passing Mountain Dew Data
        displaySaleWithDiscount("Mountain Dew",12,1.59,25);
    }
    //displaySaleWithDiscount method with respective parameters, returns nothing, just prints data
    public static void displaySaleWithDiscount(String itemDescription,
                                                int qty, 
                                                double cost,
                                                int discountPercent) 
    {   double subTotal,discountAmount,totalAmount;
        subTotal=qty*cost;
        discountAmount=subTotal*discountPercent/100.0;
        totalAmount=subTotal-discountAmount;
        System.out.printf("%-20s %5d %8.2f %5d %8.2f\n",itemDescription,qty,cost,discountPercent,totalAmount);
    } 
    //displayColumnHeaders method no parameters required, returns nothing, just prints data
    public static void displayColumnHeaders() 
    {   System.out.printf("%-20s %5s %8s %5s %8s\n","Item Description","Qty","Cost","Disc%","Total");
        System.out.printf("%-20s %5s %8s %5s %8s\n","====================","=====","========","=====","========");
        
    }   
}

