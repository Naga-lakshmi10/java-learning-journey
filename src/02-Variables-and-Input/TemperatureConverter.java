import java.util.Scanner;
public class TemperatureConverter
{
  public static void main(String[] args)

  {
      Scanner input=new Scanner(System.in);
      System.out.println("Enter temperature in Celsius:");
      int c=input.nextInt();
      double f=(c*9.0/5)+32;
      System.out.println("Temperature in Fahrenheit:"+f);

  }
}
