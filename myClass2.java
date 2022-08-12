import java.util.Scanner;  //to use Scanner
public class myClass {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String phrase;
        System.out.println("Welcome to the Pig Latin generator!");
        System.out.println("Please enter a line of text to be converted into Pig Latin: ");
        phrase = stdIn.next();
        String newWord=phrase.toLowerCase(); //convert entered string to lower case
        newWord = (newWord.substring(1) + newWord.charAt(0) + "ay");  //changing the same word in Piglatin
        newWord=newWord.substring(0, 1).toUpperCase() + newWord.substring(1); //making only first char to upper case
        System.out.println("Here is your translation: \n" +newWord); //printing same word in Piglatin
  }

}