class DukeException extends IllegalArgumentException {
    DukeException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}