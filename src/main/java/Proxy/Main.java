package Proxy;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        User user1 = new User("user1");
        User user2 = new User("user2");

        DocumentInterface unprotectedDoc = new Document("doc1", new Date(), "Unprotected Content");
        library.addDocument(unprotectedDoc);

        library.createProtectedDocument("doc2", new Date(), "Protected Content", user1.getUsername());
        library.createProtectedDocument("doc3", new Date(), "Protected Content", user2.getUsername());
        try {
            System.out.println("User1 accessing doc1: " + library.getDocument("doc1").getContent(user1));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("User1 accessing doc2: " + library.getDocument("doc2").getContent(user1));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("User2 accessing doc2: " + library.getDocument("doc2").getContent(user2));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("User2 accessing doc3 " + library.getDocument("doc3").getContent(user2));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }
    }
}
