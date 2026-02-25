
class employee1 {
    int empid;
    String name;
    int salary;
    String address;

    employee1(int empid, String name, int salary, String address) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends employee1 {
    String department;
    String subject;

    Teacher(int empid, String name, int salary, String address,
            String department, String subject) {

        super(empid, name, salary, address);
        this.department = department;
        this.subject = subject;
    }

    void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Subject: " + subject);
        System.out.println("---------------------------");
    }
}

public class inheritance {
    public static void main(String[] args) {


        Teacher[] teachers = new Teacher[3];

        teachers[0] = new Teacher(101, "John", 50000, "New York", "Science", "Physics");
        teachers[1] = new Teacher(102, "Alice", 55000, "Chicago", "Math", "Algebra");
        teachers[2] = new Teacher(103, "David", 60000, "Boston", "English", "Grammar");

        for (int i = 0; i < teachers.length; i++) {
            teachers[i].display();
        }
    }
}