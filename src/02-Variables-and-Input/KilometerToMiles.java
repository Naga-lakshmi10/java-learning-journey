import java.util.Scanner;
public class KilometerToMiles
        {
            public static void main(String[] args)
            {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter kilometers:");
                double kilometer=sc.nextDouble();
                double miles=kilometer*0.621371;
                System.out.println("Distance in kilometers:"+kilometer+" km");
                System.out.println("Distance in Miles:"+miles+" miles");
                sc.close();
            }
                }