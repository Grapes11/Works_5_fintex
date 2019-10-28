package com.company;

import java.util.Random;

public enum Color {
    /**
     * возвращает стандартный цвет.
     */
    ANSI_RESET,
    /**
     * черный цвет текста.
     */
    ANSI_BLACK,
    /**
     * красный цвет текста.
     */
    ANSI_RED,
    /**
     * зеленый цвет текста.
     */
    ANSI_GREEN,
    /**
     * желтый цвет текста.
     */
    ANSI_YELLOW,
    /**
     * синий цвет текста.
     */
    ANSI_BLUE,
    /**
     *фиолетовый цыет текста.
     */
    ANSI_PURPLE,
    /**
     *циановый цвет текста.
     */
    ANSI_CYAN,
    /**
     * белый цвет текста.
     */
    ANSI_WHITE;


    /**
     * @param color цвет текста из Enum Color
     * @return возвращает строку,
     * которая преобразует цвет
     * текста в консоле в выбранный
     */
     public static String getInstance(final Color color) {
        switch (color) {
            case ANSI_RESET: return "\u001B[0m";
            case ANSI_BLACK: return "\u001B[30m";
            case ANSI_RED: return "\u001B[31m";
            case ANSI_GREEN: return "\u001B[32m";
            case ANSI_YELLOW: return "\u001B[33m";
            case ANSI_BLUE: return "\u001B[34m";
            case ANSI_PURPLE: return "\u001B[35m";
            case ANSI_CYAN: return "\u001B[36m";
            case ANSI_WHITE: return "\u001B[37m";
            default: System.out.println("такого цвета нет");
        }
        return null;
    }

    /**
     * @return возвращает случайный цвет
     */
    public static Color getColor() {
        int i = (new Random().nextInt(Color.values().length));
        Color[] color = Color.values();
        return color[i];
        }
    }

