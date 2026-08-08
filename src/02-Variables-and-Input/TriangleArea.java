import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of base: ");
        int base = sc.nextInt();
        System.out.println("Enter the value of height:");
        int height = sc.nextInt();
        double area = (base * height) / 2.0;
        System.out.println("The area of the triangle is:" + area);
        sc.close();
    }
}