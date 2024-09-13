package Decorator;

public class Main {

    public static void main(String[] args) {
        Printer printer;

        printer = new BasicPrinter();

        printer = new EncryptedPrinter(new FilePrinter(new BasicPrinter()));
        printer.print("Moro");
    }

}
