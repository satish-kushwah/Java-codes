import java.util.Scanner;  
public class myclass {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     String str;
     int duplicate=0;
     str= in.nextLine();
      String words[] = str.split(" ");
      for(int i=0;i<words.length;i++) {
          int freq=1;
          for(int j=i+1;j<words.length;j++){
              if(words[j].equals(words[i]) && !words[j].equals(" "))
                 { freq++; words[j]=" ";}
          }
          if(freq>1)
             {System.out.println(words[i]+" "+freq); duplicate=1;}
      }
      if(duplicate==0)
         System.out.println("No Duplicates");
   }
}