package ChainOfResponsibility;

public class GeneralFeedbackHandler extends FeedbackHandler {
    @Override
    public void handleFeedback(Message message) {
        if (message.getMessageType() == MessageType.GENERAL_FEEDBACK) {
            System.out.println("Handling general feedback: " + message.getContent());
        } else if (nextHandler != null) {
            nextHandler.handleFeedback(message);
        }
    }
}