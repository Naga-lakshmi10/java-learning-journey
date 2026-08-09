import java.util.Scanner;
public class SquareArea
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side:");
        int s=sc.nextInt();
        System.out.println("Area of the square is: "+s*s);
        sc.close();

    }
}