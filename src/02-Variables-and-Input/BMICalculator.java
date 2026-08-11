import java.util.Scanner;
public class BMICalculator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Weight:");
        double weight=sc.nextDouble();
        System.out.println("Enter Height in meters:");
        double height=sc.nextDouble();
        double BMI=weight/(height*height);
        System.out.println("Your BMI is:"+BMI);
        sc.close();
    }
}