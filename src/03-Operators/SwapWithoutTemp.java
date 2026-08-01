import java.util.Scanner;
public class SwapWithoutTemp
{
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       System.out.println("Before swapping the values of a and b are:"+a+" "+b);
       a=a+b;
       b=a-b;
       a=a-b;
       System.out.println("After swapping the values of a and b are:"+a+" "+b);
   }
}