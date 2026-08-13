import java.util.Scanner;
public class AverageOfThreeNumbers
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        float a = sc.nextFloat();
        System.out.print("Enter Second Number: ");
        float b = sc.nextFloat();
        System.out.print("Enter Third Number: ");
        float c = sc.nextFloat();
        float avg = (a + b + c) / 3;
        System.out.println("The First Number:" + a);
        System.out.println("The Second Number:" + b);
        System.out.println("The Third Number:" + c);
        System.out.println("The average of three numbers is: " + avg);
        sc.close();
    }

}
