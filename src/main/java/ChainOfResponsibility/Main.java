package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {

        FeedbackHandler compensationClaimHandler = new CompensationClaimHandler();
        FeedbackHandler contactRequestHandler = new ContactRequestHandler();
        FeedbackHandler developmentSuggestionHandler = new DevelopmentSuggestionHandler();
        FeedbackHandler generalFeedbackHandler = new GeneralFeedbackHandler();

        compensationClaimHandler.setNextHandler(contactRequestHandler);
        contactRequestHandler.setNextHandler(developmentSuggestionHandler);
        developmentSuggestionHandler.setNextHandler(generalFeedbackHandler);

        Message feedback1 = new Message(MessageType.COMPENSATION_CLAIM, "Request for reimbursement.", "raksamies@example.com");
        compensationClaimHandler.handleFeedback(feedback1);

        Message feedback2 = new Message(MessageType.CONTACT_REQUEST, "Need assistance with my account.", "lvimestari@example.com");
        compensationClaimHandler.handleFeedback(feedback2);

        Message feedback3 = new Message(MessageType.DEVELOPMENT_SUGGESTION, "Add a new feature for tracking.", "metsästäjä@example.com");
        compensationClaimHandler.handleFeedback(feedback3);

        Message feedback4 = new Message(MessageType.GENERAL_FEEDBACK, "Great service!", "insinööri@example.com");
        compensationClaimHandler.handleFeedback(feedback4);
    }
}
