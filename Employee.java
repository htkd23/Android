import java.util.Scanner;
import java.util.ArrayList;

public class Employee {
    int id;
    String name;
    int age;
    String code;
    String department;
    double salary_rate;

    public Employee(int id, String name, int age, String code, String department, double salary_rate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.code = code;
        this.department = department;
        this.salary_rate = salary_rate;
    }

    public void getInformation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("Age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Code: ");
        code = sc.nextLine();
        System.out.println("Department: ");
        department = sc.nextLine();
        System.out.println("Salary Rate: ");
        salary_rate = sc.nextDouble();
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Code: " + code);
        System.out.println("Department: " + department);
        System.out.println("Salary Rate: " + salary_rate);
    }

    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();

        Employee emp1 = new Employee(1, "John Doe", 30, "E001", "IT", 5000.0);
        employeeList.add(emp1);
        Employee emp2 = new Employee(2, "Jane Smith", 25, "E002", "HR", 4000.0);
        employeeList.add(emp2);
        Employee emp3 = new Employee(3, "Jane Smith", 25, "E002", "HR", 4000.0);
        employeeList.add(emp3);
        Employee emp4 = new Employee(4, "Jane Smith", 25, "E002", "HR", 4000.0);
        employeeList.add(emp4);
        Employee emp5 = new Employee(5, "Jane Smith", 25, "E002", "HR", 4000.0);
        employeeList.add(emp5);
        Employee emp6 = new Employee(6, "Jane Smith", 25, "E002", "HR", 4000.0);
        employeeList.add(emp6);
        Employee emp7 = new Employee(7, "Jane Smith", 25, "E002", "HR", 4000.0);
        employeeList.add(emp7);
        Employee emp8 = new Employee(8, "Jane Smith", 25, "E002", "HR", 4000.0);
        employeeList.add(emp8);
        Employee emp9 = new Employee(9, "Jane Smith", 25, "E002", "HR", 4000.0);
        employeeList.add(emp9);
        Employee emp10 = new Employee(10, "Jane Smith", 25, "E002", "HR", 4000.0);
        employeeList.add(emp10);

        Scanner sc = new Scanner(System.in);

        int choice = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1. Them");
            System.out.println("2. Xoa");
            System.out.println("3. Hien thi danh sach");
            System.out.println("4. thoat");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Them:");
                    Employee newEmployee = new Employee(0, "", 0, "", "", 0);
                    System.out.println("Nhap ID: ");
                    int newId = sc.nextInt();
                    boolean isDuplicate = false;
                    for (Employee emp : employeeList) {
                        if (emp.id == newId) {
                            isDuplicate = true;
                            System.out.println("nhan vien da ton tai.");
                            break;
                        }
                    }
                    if (!isDuplicate) {
                        System.out.println("Nhap thong tin:");
                        newEmployee.getInformation();
                        employeeList.add(newEmployee);
                        System.out.println("Them thanh cong.");
                    }
                    break;
                case 2:
                    System.out.println("Xoa nhan vien:");
                    System.out.println("Nhap ID: ");
                    int employeeId = sc.nextInt();
                    boolean isFound = false;
                    for (Employee emp : employeeList) {
                        if (emp.id == employeeId) {
                            employeeList.remove(emp);
                            isFound = true;
                            System.out.println("xoa thanh cong.");
                            break;
                        }
                    }
                    if (!isFound) {
                        System.out.println("khong tim thay nhan vien.");
                    }
                    break;
                case 3:
                    System.out.println("Hien thị danh sach nhan vien:");
                    for (Employee emp : employeeList) {
                        emp.display();
                    }
                    break;
                case 4:
                    System.out.println("thoat.");
                    break;
            }
        } while (choice != 4);
        sc.close();
    }
}