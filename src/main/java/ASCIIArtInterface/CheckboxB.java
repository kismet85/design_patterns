package ASCIIArtInterface;

public class CheckboxB extends Checkbox {
    public CheckboxB(String text, boolean checked) {
        super(text, checked);
    }

    @Override
    public void display() {
        if(checked)
        {
            System.out.println("[o]");
        }
        else
        {
            System.out.println("[ ]");
        }
    }


}
