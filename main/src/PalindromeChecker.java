import java.util. Scanner;
public class PalindromeChecker {
    public static void main(String[] args){
        String word="madam";
        boolean ispalindrome=true;
        for(int i=0;i<word.length()/2;i++){
          if(word.charAt(i) != word.charAt(word.length()-1-i)){
            ispalindrome = false;
            break;
          }
        }
        if (ispalindrome){
            System.out.println(word+ " is a palindrome");
        }else{
            System.out.println(word+" is not a palindrone");
        }
    }
}
