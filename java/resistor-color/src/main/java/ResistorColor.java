import java.util.Arrays;

class ResistorColor {
    private final String[] colorsArray = new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int colorCode(String color) {
        return Arrays.asList(colorsArray).indexOf( color);
    }

    String[] colors() {
        return colorsArray;
    }
}
