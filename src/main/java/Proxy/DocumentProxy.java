package Proxy;

import java.util.Date;
import Proxy.AccessDeniedException;
public class DocumentProxy implements DocumentInterface {
    private Document document;
    private boolean isProtected;

    public DocumentProxy(Document document, boolean isProtected) {
        this.document = document;
        this.isProtected = isProtected;
    }

    public String getIdentifier() {
        return document.getIdentifier();
    }

    public Date getCreationDate() {
        return document.getCreationDate();
    }

    public String getContent(User user) throws AccessDeniedException {
        if (!isProtected || AccessControlService.getInstance().isAllowed(document.getIdentifier(), user.getUsername())) {
            return document.getContent(user);
        } else {
            throw new AccessDeniedException("Access denied for user: " + user.getUsername());
        }
    }
}