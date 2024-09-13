package Decorator;

import java.util.Arrays;
import java.util.Random;

public class EncryptedPrinter extends PrinterDecorator{

    public EncryptedPrinter(Printer printer)
    {
        super(printer);
    }
    String[] randomEncryptor = { "x", "z", "y", "1", "2", "3"};

    Random random = new Random();

    public String encryptMessage(String message)
    {
        StringBuilder newMessage = new StringBuilder();

        for (char c : message.toCharArray()) {
            int randomSign = random.nextInt(randomEncryptor.length);

            newMessage.append(randomEncryptor[randomSign]);
        }

        return newMessage.toString();
    }

    @Override
    public void print(String message)
    {
        super.print(encryptMessage(message));
    }

}
