import java.util.Scanner;

public class Iterators {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        // for loop
        System.out.println("For Loop:");
    for (int i=0;i<=10;i++){
        System.out.print(i+"   ");
    }
    /// while loop
    System.out.println("While Loop");
    int a =0;
    while ( a<10) {
        System.out.println(a);
        a=a+1;
    }
    // do while loop4
    System.out.println("Do WHile Loop");
    int b=0;
    do{
        System.out.println(b);
        b=b+1;
    }
    while(b<=10);
    
    // /sum of first natural numbers
    System.out.println("Print sum of first natural numbers:");
    System.out.print("enter the nunber:");
    int n=sc.nextInt();
    int sum=0;
    
    for(int c=1;c<=n;c++){
        sum=sum + c;
        
    }
    System.out.println(sum);

    // /print the table of the number n
    System.out.println("Print the table of the given number:");
    int f=sc.nextInt();
    for(int d=1;d<=10;d++){

        System.out.println(f*d);
    }

    }
}
