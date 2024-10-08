package ChainOfResponsibility;

public class DevelopmentSuggestionHandler extends FeedbackHandler {
    @Override
    public void handleFeedback(Message message) {
        if (message.getMessageType() == MessageType.DEVELOPMENT_SUGGESTION) {
            System.out.println("Handling development suggestion: " + message.getContent());
        } else if (nextHandler != null) {
            nextHandler.handleFeedback(message);
        }
    }
}