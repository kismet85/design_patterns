package ChainOfResponsibility;

public class CompensationClaimHandler extends FeedbackHandler {
    @Override
    public void handleFeedback(Message message) {
        if (message.getMessageType() == MessageType.COMPENSATION_CLAIM) {
            System.out.println("Handling compensation claim: " + message.getContent());
        } else if (nextHandler != null) {
            nextHandler.handleFeedback(message);
        }
    }
}