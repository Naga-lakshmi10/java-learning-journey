import java.util.Scanner;
public class StudentMarks
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks in subject1: ");
        int subject1=input.nextInt();
        System.out.println("Enter the marks in subject2: ");
        int subject2=input.nextInt();
        System.out.println("Enter the marks in subject3: ");
        int subject3=input.nextInt();
        System.out.println("Enter the marks in subject4: ");
        int subject4=input.nextInt();
        System.out.println("Enter the marks in subject5: ");
        int subject5=input.nextInt();
        System.out.println("MArks iin subject1: "+subject1);
        System.out.println("MArks iin subject2: "+subject2);
        System.out.println("MArks iin subject3: "+subject3);
        System.out.println("MArks iin subject4: "+subject4);
        System.out.println("MArks iin subject5: "+subject5);
        int total=subject1+subject2+subject3+subject4+subject5;
        System.out.println("the total marks is: "+total);
        double avg=total/5.0;
        System.out.println("The average marks is: "+avg);
        input.close();

    }
}