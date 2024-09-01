package ASCIIArtInterface;

public class Main {

    public static void main(String[] args) {
        UIFactory factoryA = new AFactory();

        Button buttonA = factoryA.createButton("Click Me");
        TextField textFieldA = factoryA.createTextField("Enter Text");
        Checkbox checkboxA = factoryA.createCheckbox("Accept Terms", true);

        buttonA.display();
        textFieldA.display();
        checkboxA.display();
        
        buttonA.setText("Updated Button");
        buttonA.display();
    }
}
