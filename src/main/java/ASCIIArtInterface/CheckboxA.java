package ASCIIArtInterface;

public class CheckboxA extends Checkbox {


    public CheckboxA(String text, boolean b) {
        super(text, true);
    }

    @Override
    public void display() {
        if(checked)
        {
            System.out.println("[x]");
        }
        else
        {
            System.out.println("[ ]");
        }
    }
}
