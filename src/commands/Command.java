package commands;

public enum Command {
    ADD("add"),
    LIST("list"),
    EXIT("exit"),
    DEFAULT("default");



    private String text;

    Command(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public static Command fromString(String text) {
        for (Command b : Command.values()) {
            if (b.text.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return DEFAULT;
    }
}
