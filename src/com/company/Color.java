package com.company;

public enum Color {
    ANSI_BLACK,
    ANSI_RED,
    ANSI_GREEN,
    ANSI_YELLOW,
    ANSI_BLUE,
    ANSI_PURPLE,
    ANSI_CYAN,
    ANSI_WHITE;


     static String getInstance(String color) {
        switch (color) {
            case ("ANSI_RESET"): return "\u001B[0m";
            case ("ANSI_BLACK"): return "\u001B[30m";
            case ("ANSI_RED"): return "\u001B[31m";
            case ("ANSI_GREEN"): return "\u001B[32m";
            case ("ANSI_YELLOW"): return "\u001B[33m";
            case ("ANSI_BLUE"): return "\u001B[34m";
            case ("ANSI_PURPLE"): return "\u001B[35m";
            case ("ANSI_CYAN"): return "\u001B[36m";
            case ("ANSI_WHITE"): return "\u001B[37m";
        }
        return null;
    }

    static Color getColor()
    {
        int i = (int) (Math.random()*8);
        switch (i) {
            case (0): return Color.ANSI_BLACK;
            case (1): return Color.ANSI_RED;
            case (2): return Color.ANSI_GREEN;
            case (3): return Color.ANSI_YELLOW;
            case (4): return Color.ANSI_BLUE;
            case (5): return Color.ANSI_PURPLE;
            case (6): return Color.ANSI_CYAN;
            case (7): return Color.ANSI_WHITE;
        }
        return null;
    }
}
