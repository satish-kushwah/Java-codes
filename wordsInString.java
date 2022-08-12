import java.util.Scanner;
public class CoundWords {
  
  public static int countWords(String str){
    int tw=0,i,pw=0;
    for(i=0;i<str.length();i++){
      if(str.charAt(i)!=' ' && pw==0)
        { pw=1; tw=tw+1;}
      else if(str.charAt(i)==' ' && pw==1)
        pw=0;
    }
    return tw;
  }
  public static void main(String[] args){
    String str;
    int tw;
    Scanner scan= new Scanner(System.in);
    System.out.print("enter a string : ");
    str=scan.nextLine();
   // str+=scan.nextLine();
    tw=countWords(str);
    System.out.print("your string has "+tw+" words and "+str.length()+" characters");
    
  }
}
    