package duke;

import java.util.Scanner;

public class Ui {

    private final String lines = "--------------------------------------------------------------------------------------------";
    private String currentResponse;

    /**
     * Constructor for class Ui
     */
    public Ui() {
    }

    /**
     * Prints out the response
     *
     * @param dukeReply response to be printed
     */
    public void reply(String dukeReply) {
        currentResponse = dukeReply;
        //System.out.println(dukeReply);
    }

    public String getCurrentResponse() {
        return this.currentResponse;
    }

    /**
     * Prints out the error message
     *
     * @param message error message to be printed
     */
    public void showLoadingError(String message) {
        this.reply(message);
    }

    /**
     * Prints out the welcome message
     */
    public void showWelcome() {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        String toPrint = ("Hello from \n" + logo + "What can I do for you?");
        this.reply(toPrint);
    }

    /**
     * Returns the next user input
     *
     * @return next user input in String
     */
    public String readCommand() {
        System.out.println("\nInput:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    /**
     * Returns the opening String
     */
    public void printReplyOpening() {
        System.out.println(lines);
        System.out.println("Output: \n");
    }

    /**
     * Returns the closing String
     */
    public void printReplyClosing() {
        System.out.println(lines);
    }

    /**
     * Prints the closing String
     */
    public void showClosingMessage() {
        this.reply("Good bye, see you soon!");
    }
}
