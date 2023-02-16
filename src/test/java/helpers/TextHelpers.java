package helpers;

public enum TextHelpers {
    VALID_TEXT("Valid XML"),
    UNEXPECTED_TAG_TEXT("Unexpected closing tag contact"),
    START_WITH_ROOT_TAG_TEXT("Document should start from root tag or instruction. "),
    CLOSE_ROOT_TAG_TEXT("Instruction tag is not closed"),
    ALL_DATA_IN_ROOT_TAG_TEXT("All data should be inside of the root tag"),
    TAG_FORMAT_TEXT("Tag contacts name never closed. Tag names must have format <name>."),
    CLOSE_TAG_TEXT("The tag  closed incorrectly. Missing >");

    private String textHelper;

    TextHelpers(String textHelper) {
        this.textHelper = textHelper;
    }

    public String getTextHelper() {
        return textHelper;
    }
}