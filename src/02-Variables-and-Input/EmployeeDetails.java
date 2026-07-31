import java.util.Scanner;
public class EmployeeDetails
{
    public static void main(String[] args)
    {
     Scanner input=new Scanner(System.in);
     System.out.println("Enter name of the employee: ");
     String Name=input.nextLine();
     System.out.println("enter the id of the employee: ");
     int Id=input.nextInt();
     input.nextLine();
     System.out.println("enter the name of the department: ");
     String department=input.nextLine();
     System.out.println("enter the salary: ");
     int salary=input.nextInt();
     System.out.println("Name: "+Name);
     System.out.println("ID: "+Id);
     System.out.println("Department: "+department);
     System.out.println("Salary: "+salary);
     input.close();
    }
}