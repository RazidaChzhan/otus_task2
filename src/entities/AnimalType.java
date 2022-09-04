package entities;

import commands.Command;

public enum AnimalType {
    CAT("cat"),
    DOG("dog"),
    DUCK("duck"),
    DEFAULT("default");
    private String text;

    AnimalType (String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public static AnimalType fromString(String text) {
        for (AnimalType type : AnimalType.values()) {
            if (type.text.equalsIgnoreCase(text)) {
                return type;
            }
        }
        return DEFAULT;
    }
}
