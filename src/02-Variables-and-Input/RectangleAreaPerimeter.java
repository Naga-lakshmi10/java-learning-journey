import java.util.Scanner;
public class RectangleAreaPerimeter
        {
            public static void main(String[] args)
            {
                Scanner sc=new Scanner(System.in);
                int length=sc.nextInt();
                int width=sc.nextInt();
                int area=length*width;
                System.out.println("The area of the rectangle is:"+area);
                int perimeter=2*(length+width);
                System.out.println("The perimeter of the rectangle is:"+perimeter);
                sc.close();

            }
                }

