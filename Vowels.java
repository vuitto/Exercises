import java.util.Scanner;

public class Vowels {

  public static void main(String[] args) {
    int vowelsCount = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String:");
    String str = sc.nextLine();
    System.out.println("Your String:" + str);
     
      str = str.toLowerCase();
    
    
        for (int i = 0; i < str.length(); i++){
        char ch = str.charAt(i);
          if(ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u'){
            vowelsCount++;
          }
      }
    
    System.out.println(vowelsCount);
  }

}
