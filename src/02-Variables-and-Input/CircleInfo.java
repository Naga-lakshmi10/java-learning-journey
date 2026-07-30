import java.util.Scanner;
public class CircleInfo
{
    public static void main(String[] args)
{
    Scanner input=new Scanner(System.in);
    System.out.println("Enter radius:");
    int radius=input.nextInt();
    System.out.println("Radius: "+radius);
    System.out.println("Diameter: "+radius*radius);
    System.out.println("Circumference: "+(2*3.14*radius));
    System.out.println("Area: "+(3.14*radius*radius));

}
}