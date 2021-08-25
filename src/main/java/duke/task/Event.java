package duke.task;

import duke.Duke;

import java.time.LocalDate;

public class Event extends Task{
    private LocalDate time;

    /**
     * Constructor for Event class
     *
     * @param taskName name of task
     * @param time due date of task
     */
    public Event(String taskName, LocalDate time) {
        super(taskName);
        this.time = time;
    }

    /**
     * Returns the string representation of the event
     *
     * @return string representation of the event
     */
    @Override
    public String toString() {
        return "[E]" + "[" + checkIfTaskCompleted(this) + "] " + this.getTaskName() + this.getTimeString();
    }

    /**
     * returns the string representation of the due date
     *
     * @return string representation of the due date
     */
    public String getTimeString() {
        return "(at: " + this.time.format(Duke.getFormatter()) + ")";
    }
}
