import java.util.Scanner;
public class findSubstring  { 
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        String substr,str;
        System.out.print("Enter the substring: ");
        substr = scan.next();
        System.out.print("Enter the string: ");
        //to scan string with space in it
        str=scan.next();
        str+=scan.nextLine();
        int fIndex=-1;
        fIndex = str.indexOf(substr); 
        if(fIndex!=-1){
            System.out.print(substr+" is found in "+str+" at position(s) "+fIndex+" ");
            fIndex=fIndex+1;
            while(str.indexOf(substr,fIndex)!=-1){
                System.out.print(str.indexOf(substr,fIndex)+" ");
                fIndex=str.indexOf(substr,fIndex)+1;
            }
        }
        else
            System.out.print(substr+" is not found in "+str);
    }
        
}

