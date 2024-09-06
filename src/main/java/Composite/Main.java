package Composite;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Alice", 50000);
        Employee emp2 = new Employee("Bob", 60000);
        Employee emp3 = new Employee("Charlie", 70000);

        Department engineering = new Department("Engineering");
        Department hr = new Department("Human Resources");

        engineering.add(emp1);
        engineering.add(emp2);
        hr.add(emp3);

        Department company = new Department("Company");
        company.add(engineering);
        company.add(hr);

        System.out.println("Total Salary of Organization: " + company.calculateTotalSalary());

        System.out.println(company.toXML(0));
    }
}