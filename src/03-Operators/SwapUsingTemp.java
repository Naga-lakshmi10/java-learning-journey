import java.util.Scanner;
class SwapUsingTemp
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before Swapping the value of a and b is: "+a+" " +b);
        int c=a;
        a=b;
        b=c;
        System.out.println("After Swappinig the value of a and b is: "+a+" " +b);


    }
}