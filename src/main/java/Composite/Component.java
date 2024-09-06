package Composite;
abstract class Component {
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    public abstract String getName();
    public abstract double getSalary();

    public abstract double calculateTotalSalary();
    public abstract String toXML(int indentationLevel);
}