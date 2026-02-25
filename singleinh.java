import java.util.Scanner;

class employee2 {
    int empid;
    String name;
    double salary;
    String address;

    employee2(int empid, String name, double salary, String address) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class teacher2 extends employee2 {
    String dept;
    String sub;

    teacher2(int empid, String name, double salary, String address,
             String dept, String sub) {
        super(empid, name, salary, address);
        this.dept = dept;
        this.sub = sub;
    }

    void display() {
        System.out.println("Employee id: " + empid);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + dept);
        System.out.println("Subject: " + sub);
        System.out.println("....................................");
    }
}

public class singleinh {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("No. of teachers:");
        int num = sc.nextInt();
        sc.nextLine(); 

        teacher2[] t = new teacher2[num];

        for (int i = 0; i < num; i++) {

            System.out.println("Enter the details of teacher " + (i + 1));

            System.out.println("Emp id:");
            int id = sc.nextInt();
            sc.nextLine();   

            System.out.println("Emp name:");
            String name = sc.nextLine();

            System.out.println("Salary:");
            double salary = sc.nextDouble();
            sc.nextLine();   

            System.out.println("Address:");
            String add = sc.nextLine();

            System.out.println("Department:");
            String depart = sc.nextLine();

            System.out.println("Subject:");
            String subject = sc.nextLine();

            t[i] = new teacher2(id, name, salary, add, depart, subject);
        }

        System.out.println("\nTeacher details:");
        for (int i = 0; i < num; i++) {
            t[i].display();
        }

        sc.close();
    }
}