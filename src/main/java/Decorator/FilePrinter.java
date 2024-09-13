package Decorator;

import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter extends PrinterDecorator {

    public FilePrinter(Printer printer)
    {
        super(printer);
    }
    private static final String FILE_NAME = "output.txt";

    @Override
    public void print(String message) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
