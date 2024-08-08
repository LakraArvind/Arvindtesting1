public class StaticDemo {
    static String Employee_name;
    static float Employee_salary;

    static void set(String s, float n) {
        Employee_name = s;
        Employee_salary = n;
    }

    static void get() {
        System.out.println("EMPLOYEE NAME  :" + Employee_name);
        System.out.println("Employee Salary :" + Employee_salary);
    }

    public static void main(String args[]) {
        StaticDemo.set("Arvind lakra", 1000.0f);
        StaticDemo.get();

    }
}