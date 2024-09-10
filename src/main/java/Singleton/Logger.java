package Singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {

    private static Logger instance;
    private PrintWriter writer;
    private String fileName;

    private Logger(String fileName) {
        this.fileName = fileName;
        try {
            writer = new PrintWriter(new FileWriter(fileName, true), true);
        } catch (IOException e) {
            System.err.println("Error initializing logger: " + e.getMessage());
        }
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger("log.txt");
        }
        return instance;
    }

    public synchronized void write(String message) {
        if (writer != null) {
            writer.println(message);
        }
    }

    public synchronized void setFileName(String newFileName) {
        close();
        this.fileName = newFileName;
        try {
            writer = new PrintWriter(new FileWriter(fileName, true), true);
        } catch (IOException e) {
            System.err.println("Error opening new log file: " + e.getMessage());
        }
    }

    public synchronized void close() {
        if (writer != null) {
            writer.close();
        }
    }
}
