package Proxy;

import java.util.Date;
public interface DocumentInterface {
    String getIdentifier();
    String getContent(User user) throws AccessDeniedException;
    Date getCreationDate();
}
