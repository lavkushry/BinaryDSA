package PgJAVABOOK.Chap_3;

import java.util.Scanner;

//Program 3.6
class  SmartCard
{
    int emp_idn;
    public void MarkAttendence(Employee e)
    {
        emp_idn=e.getEmpid();
        //Instruction to mark present for emp_id ...
        System.out.println("Employee"+emp_idn+"is Marked Present");
    }
    public int getEmpIdn(Employee e)
    {
        return e.empid;
    }
}
class  Employee
{
    int empid;
    Employee()
    {
        System.out.println("Enter Employee id");
        Scanner sc = new Scanner(System.in);
        this.empid=sc.nextInt();
    }
    int getEmpid(){
        return empid;
    }
    public void Login(SmartCard sc)
    {
        // Instruction to Login func
        //get empid of smart card holder
        int eid= sc.getEmpIdn(this);
        //Login and mark Attendence
        System.out.println("Login Successful for Employeee"+eid);
    }
}
public class AssociationDemo {
    public static void main(String[] args) {
        System.out.println("*** ASSOCIATION BETWEEN EMPLOYEE AND SMARTCAD ***");
        Employee e=new Employee();
        System.out.println("NEW EMPLOYEE IS CREATED");
        SmartCard scd= new SmartCard();
        scd.MarkAttendence(e);
        e.Login(scd);
    }
}
