package ChainOfResponsibility;

public class ContactRequestHandler extends FeedbackHandler {
    @Override
    public void handleFeedback(Message message) {
        if (message.getMessageType() == MessageType.CONTACT_REQUEST) {
            System.out.println("Handling contact request: " + message.getContent());
        } else if (nextHandler != null) {
            nextHandler.handleFeedback(message);
        }
    }
}