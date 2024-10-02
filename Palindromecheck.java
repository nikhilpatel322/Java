import java.util.*;
public class Palindromecheck {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string :");
        String input=sc.nextLine();

        String cleaned =input.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String reverse=new StringBuilder(cleaned).reverse().toString();

        if (cleaned.equals(reverse)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
