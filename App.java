import javax.print.attribute.standard.OrientationRequested;

public class App {
    public static void main(String[] args) 
     {
         int a=10;
         int b=3;

        //Arithemetic Operators
        System.out.println("Arithemetic Operators:");
        System.out.println("a+b:" +(a+b));
        System.out.println("a-b:"+(a-b));
        System.out.println("a*b:"+(a*b));
        System.out.println("a/b:"+(a/b));
        System.out.println("a%b:"+(a%b));

        //== (Equal to)
        //!= (Not equal to)
        //> (Greater than)
       /// < (Less than)
       ///// >= (Greater than or equal to)
       /// <= (Less than or equal to)

      System.out.println("Relational Operators:");
       System.out.println("a==b:"+(a==b));
       System.out.println("a!=b:"+(a!=b));
       System.out.println("a>b:"+(a>b));
       System.out.println("a<b:"+(a<b));
       System.out.println("a>=b:"+(a>=b));
       System.out.println("a<=b:"+(a<=b));

       ///////////LOGICAL OPERATORS
       //AND(&&)
       //OR(||)
       //NOT(!)
       boolean x= true;
       boolean y=false;
         
         System.out.println("Logical Operators:");
         System.out.println("x && y:"+(x && y));
         System.out.println("x || y:"+(x || y));
         System.out.println("!x: "+ !x);

       ///////BITWISE OPERATORS
       // BITWISE AND (&)
       //BITWIESE OR(|)
       //BITWISE XOR(^)
       //BITWISE NOT(~)
       //BITWISE LEFT SHIFT(<<)
       //BITWISE RIGHT SHIFT(<<)


        System.out.println("BITWISE OPERATORS:");
        System.out.println(" a & b:"+(a & b));
        System.out.println(" a | b:"+(a | b));
        System.out.println(" a ^ b:"+(a^b));
        System.out.println("~b:"+(~ b));
        System.out.println("a<<1:"+(a<<1));
        System.out.println("a>>1:"+(a<<1));
       
       ///////ASSIGNMENT OPERATORS
       //   +=
       //  -=
       //   *=
       //   /=
       //   %=
       float e =5;
       System.out.println("ASSIGNMENT OPERATORS:");
       e += 6;
       System.out.println(" "+e);
       e-= 7;
       System.out.println(""+e);
       e*=10;
       System.out.println(""+e);
       e/=2;
       System.out.println(""+e);
       e%=3;
       System.out.println(""+e);
       

       //////// UNARY OPERATORS
       // PRE INCREMENT
       // POST INCREMENT
       // PRE DECREMENT
       // POST DECREMENT
        
       int f=6;
       System.out.println("UNARY OPERATORS");
       System.out.println(""+(++f));
       System.out.println(""+(f++));
       System.out.println(""+(--f));
       System.out.println(""+(f--));


    }
}
