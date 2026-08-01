import java.util.Scanner;
public class Multiplication
{
    public static void  main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a value: ");
        int a=input.nextInt();
        System.out.println("enter b value: ");
        int b=input.nextInt();
        System.out.println("the multiplication of a and b is: "+(a*b));
    }
}