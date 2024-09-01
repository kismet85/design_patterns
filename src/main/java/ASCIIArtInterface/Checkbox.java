package ASCIIArtInterface;

public abstract class Checkbox {

    protected String text;
    boolean checked = false;
    public Checkbox(String text, boolean checked)
    {
        this.text = text;
        this.checked = checked;
    }
    public abstract void display();

    public void setText(String text) {
        this.text = text;
    }

}
