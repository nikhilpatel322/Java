import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /////Voting Eligibility
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible for voting.");
        } else {
            System.out.println("You are not eligible for voting.");
        }

        /////Checking odd or even
        if (age % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }



        /////compariosn between two numbers
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b)
        {
            System.out.println("A equal B");
        }
        else if(a>=b){
        System.out.println("a greater and equal to b");
        }
        else if(a<=b){
            System.out.println("a less and equal to b");
        }
        else {
            System.out.println("invalid");
        }
        
        ////If else

         int button=sc.nextInt();
        if(button==1){
            System.out.println("Hello");
        }else if(button ==2){
            System.out.println("Namaste");
        }else if(button ==3){
            System.out.println("Bonjour");
        }else{
            System.out.println("invalid");
        }



        /////Switch case
        switch (button) {
            case 1:System.out.println("Hello");
                break;
                case 2:System.out.println("Namaste");
                break;
                case 3:System.out.println("Bonjour");
                break;
        
            default:System.out.println("inavlid");
                break;
        }

    }
}