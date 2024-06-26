package services.tweetservice.exceptions;

public class NoSuchMessageException extends IllegalArgumentException {
    private final Long messageId;

    public NoSuchMessageException(Long messageId) {
        super(String.format("Creator with id %d is not found in DB", messageId));
        this.messageId = messageId;
    }
}
