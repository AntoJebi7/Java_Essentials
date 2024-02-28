package Problems;
import java.util.Scanner;

class Employee {
    int empid;
    String empname;
    String address;
    String mailid, mobileno;
    Employee() {
    }
    Employee(int id, String name, String addr, String mail, String mob) {
        this.empid = id;
        this.empname = name;
        this.address = addr;
        this.mailid = mail;
        this.mobileno = mob;
    }
}

class Programmer extends Employee {
    double BP, grosssalary, netsalary;
    public Programmer(int id, String name, String addr, String mail, String mob) {
        super(id, name, addr, mail, mob);
    }
    void computepay() {
        System.out.print("Enter basic pay: ");
        Scanner in = new Scanner(System.in);
        BP = in.nextDouble();
        double DA, HRA, PF, Fund;
        DA = (BP * 97 / 100);
        HRA = (BP * 10 / 100);
        PF = (BP * 12 / 100);
        Fund = (BP * 0.1 / 100);
        grosssalary = BP + DA + HRA;
        netsalary = BP + DA + HRA - (PF + Fund);
        System.out.println("Empid:" + empid);
        System.out.println("Emp Name:" + empname);
        System.out.println("Emp address:" + address);
        System.out.println("Mail id:" + mailid);
        System.out.println("Mobile No:" + mobileno);
        System.out.println("Gross Salary:" + grosssalary);
        System.out.println("Net Pay:" + netsalary);
    }
}
class AsstProf extends Employee {
    double BP, grosssalary, netsalary;

    public AsstProf(int id, String name, String addr, String mail, String mob) {
        super(id, name, addr, mail, mob);
    }
    void computepay() {
        System.out.print("Enter basic pay: ");
        Scanner in = new Scanner(System.in);
        BP = in.nextDouble();
        double DA, HRA, PF, Fund;
        DA = (BP * 97 / 100);
        HRA = (BP * 10 / 100);
        PF = (BP * 12 / 100);
        Fund = (BP * 0.1 / 100);
        grosssalary = BP + DA + HRA;
        netsalary = BP + DA + HRA - (PF + Fund);
        System.out.println("Empid:" + empid);
        System.out.println("Emp Name:" + empname);
        System.out.println("Emp address:" + address);
        System.out.println("Mail id:" + mailid);
        System.out.println("Mobile No:" + mobileno);
        System.out.println("Gross Salary:" + grosssalary);
        System.out.println("Net Pay:" + netsalary);
    }
}
// Similar classes for AssociateProf and Professor would go here...
public class employee_inheritance {
    public static void main(String[] args) {
        Programmer p = new Programmer(10, "AAA", "XXX", "aaa@gmail.com", "1233445566");
        System.out.println("Programmer: ");
        p.computepay();

        AsstProf ap = new AsstProf(10, "bbb", "yyy", "bbb@gmail.com", "1233445566");
        System.out.println("Asst Professor: ");
        ap.computepay();

        // You can create instances of AssociateProf and Professor here and compute their pay.
    }
}
