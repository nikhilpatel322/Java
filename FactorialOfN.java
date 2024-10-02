import java.util.Scanner;
public class FactorialOfN {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        long fact=1;
        System.out.print("Enter the number:");
        int  n=sc.nextInt();
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.printf("factorial of %d is %d",n,fact);
    }

}
