package Composite;

class Employee extends Component {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public double calculateTotalSalary() {
        return salary;
    }

    @Override
    public String toXML(int indentationLevel) {
        String indent = " ".repeat(indentationLevel);
        return indent + "<Employee name=\"" + name + "\" salary=\"" + salary + "\" />\n";
    }
}