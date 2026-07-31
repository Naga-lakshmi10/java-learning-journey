import java.util.Scanner;
public class PersonalInfo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String Name=sc.next();
        System.out.println("Name: "+Name);
        int Age=sc.nextInt();
        sc.nextLine();
        System.out.println("Age: "+Age);
        String Branch=sc.nextLine();
        System.out.println("Branch: "+Branch);
        String college=sc.nextLine();
        System.out.println("College: "+college);
        float CGPA=sc.nextFloat();
        System.out.println("CGPA: "+CGPA);
        sc.close();

    }
}