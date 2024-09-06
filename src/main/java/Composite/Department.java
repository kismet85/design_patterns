package Composite;

class Department extends Component {
    private String name;
    private java.util.List<Component> components = new java.util.ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return 0; // Department doesn't have a salary
    }

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public double calculateTotalSalary() {
        double total = 0;
        for (Component component : components) {
            total += component.calculateTotalSalary();
        }
        return total;
    }

    @Override
    public String toXML(int indentationLevel) {
        String indent = " ".repeat(indentationLevel);
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("<Department name=\"").append(name).append("\">\n");
        for (Component component : components) {
            sb.append(component.toXML(indentationLevel + 2));
        }
        sb.append(indent).append("</Department>\n");
        return sb.toString();
    }
}