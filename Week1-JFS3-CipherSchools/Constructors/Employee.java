public class Employee {

    //Constructors
    //constructor is a special Function.

    //<identification>

    //1.1 constructor has same name as the class name
    //1.2 it has no return type

    //<purpose>
    //1.1 it creates/initializes Object in Memory(RAM)
    //1.2 you can use constructor block to initialize some default values.

    int employeeId;
    int salary;
    String Dept;
    Employee(int empid, int sal, String d) {
        employeeId = empid;
        salary = sal;
        Dept = d;
    }
    public static void main(String[] args) {
        Employee Akshitha = new Employee(101, 200000, "Developer");
        Employee Harsha = new Employee(102, 50000, "Data Engineer");
        // here we are calling the constructor

        System.out.println("Employee Id: " + Akshitha.employeeId + " Salary: " + Akshitha.salary + " Department: " + Akshitha.Dept);
        System.out.println("Employee Id: " + Harsha.employeeId + " Salary: " + Harsha.salary + " Department: " + Harsha.Dept);

    }
}
