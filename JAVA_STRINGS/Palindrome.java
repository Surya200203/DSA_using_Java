import java.util.*;

public class Palindrome {

    public static boolean palindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                System.out.println("String is not a palindrome");
                return false;
            }
        }
        System.out.println("String is  palindrome");
        return true;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        palindrome(str);


        
    }
    
}
