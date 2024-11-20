package Prototype;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Recommendation youngAdults = new Recommendation("Young Adults");
        youngAdults.addBook(new Book("Harry Potter", "J.K. Rowling", "Fantasy", 1997));
        youngAdults.addBook(new Book("The Hunger Games", "Suzanne Collins", "Dystopian", 2008));

        System.out.println("Initial Recommendations:");
        System.out.println(youngAdults);

        Recommendation clonedRecommendation = youngAdults.clone();
        clonedRecommendation.setTargetAudience("Fantasy Lovers");
        clonedRecommendation.addBook(new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", 1937));

        System.out.println("\nCloned and Modified Recommendations:");
        System.out.println(clonedRecommendation);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. View Recommendations");
            System.out.println("2. Clone Recommendation");
            System.out.println("3. Modify Cloned Recommendation");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Original Recommendation:");
                    System.out.println(youngAdults);
                    System.out.println("Cloned Recommendation:");
                    System.out.println(clonedRecommendation);
                    break;

                case 2:
                    System.out.println("Cloning...");
                    clonedRecommendation = youngAdults.clone();
                    System.out.println("Cloned Recommendation:");
                    System.out.println(clonedRecommendation);
                    break;

                case 3:
                    System.out.println("Enter book title to add:");
                    String title = scanner.nextLine();
                    System.out.println("Enter author:");
                    String author = scanner.nextLine();
                    System.out.println("Enter genre:");
                    String genre = scanner.nextLine();
                    System.out.println("Enter publication year:");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    clonedRecommendation.addBook(new Book(title, author, genre, year));
                    System.out.println("Modified Cloned Recommendation:");
                    System.out.println(clonedRecommendation);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
