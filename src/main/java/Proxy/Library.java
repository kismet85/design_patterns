package Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Library {

    private Map<String, DocumentInterface> documents = new HashMap<>();

    public void addDocument(DocumentInterface document) {
        documents.put(document.getIdentifier(),document);
    }

    public DocumentInterface getDocument(String identifier) {
        return documents.get(identifier);
    }

    public void createProtectedDocument(String identifier, Date creationDate, String content, String username) {
        Document realDocument = new Document(identifier, creationDate, content);
        DocumentProxy proxy = new DocumentProxy(realDocument, true);
        addDocument(proxy);
        AccessControlService.getInstance().grantAccess(identifier, username);
    }
}
