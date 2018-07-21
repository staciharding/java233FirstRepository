package edu.pcc.cis.gitattempt;

/**
 * Demo class that constructs message for output
 *
 * @author Staci Harding
 * @version 2018.07.21
 */

public class GitMessage {

    private String message;
    private int occurrence;

    public GitMessage(String message, int occurrence){
        this.message = message;
        this.occurrence = occurrence;
    }

    public String getMessage() {
        return message;
    }

    public int getOccurrence() {
        return occurrence;
    }

    public void setMessage(String newMessage) {
        this.message = newMessage;
    }

    public void setOccurrence(int newOccurrence) {
        this.occurrence = newOccurrence;
    }

}
