import java.util.Scanner;
public class AverageGradeCalculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the marks of maths:");
        int maths=sc.nextInt();
        System.out.print("enter the science marks:");
        int science=sc.nextInt();
        System.out.print("enter the english marks:");
        int english=sc.nextInt();
         float AverageGradeCalculate=(float)( maths+  science+  english)/3.0f;
         System.out.println("avergae grade is   "+AverageGradeCalculate);
    }
}