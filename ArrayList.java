import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
    	Scanner scan= new Scanner(System.in);
        String name;
        //asking user for input
        System.out.print("Enter you first name: ");
        //storing user input to string variable
        name=scan.next();
        //declaring a ArrayList with the type String.
        ArrayList<String> nameLetters = new ArrayList<String>();
        //Each letter of the inputted name being stored in a separate element of the ArrayList
        for(int i=0; i<name.length(); ++i) 
        	nameLetters.add(Character.toString(name.charAt(i)));
        // Printing the ArrayLists
        System.out.println(nameLetters);
    }    
}

