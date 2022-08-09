import java.util.Scanner;
class A
{
   Scanner sc= new Scanner(System.in);
   A()
  {
     System.out.print("Enter ID : ");
     int id = sc.nextInt();
     
     System.out.print("Enter name : ");
     String name = sc.next();
     System.out.print("Enter Age ");
     int age = sc.nextInt();
     System.out.print("Enter Salary  ");
     int sal = sc.nextInt();
     
     System.out.print("Enter Designation  ");
     String desig = sc.next();

     System.out.println("ID : "+id);
     System.out.println("NAME : "+name);
     System.out.println("AGE : "+age);
     System.out.println("SALARY : "+sal);
     System.out.println("DESIG : "+desig);
          
   }
}
class Demo2
{ 
  public static void main(String args[])
  {
    A a = new A();
 }
}