package edu.pcc.cis.gitattempt;

/**
 * Demo class that produces dialogue
 *
 * @author Staci Harding
 * @version 2018.07.21
 */


public class GitAttempt {

    private GitMessage output;

    public GitAttempt(String message, int occurrence) {
        output = new GitMessage(message, occurrence);
    }

    public void printOutput() {
        int x = output.getOccurrence();
        for (int i = 0; i < x; i++) {
            System.out.println(output.getMessage());
        }
    }

}
