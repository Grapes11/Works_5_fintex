
/**
 * Данный класс называется Animal.
 * Он используется для доп задания по Generics
 *
 * @version 28.01.2019
 * @author Никита Виноградов
 *
 */

package com.company.Generics_three;

public class  Animal<T> {

    /**
     * Возраст животного.
     */
    private int age;
    /**
     * Имя животного.
     */
    private String name;
    /**
     * Расцветка животного.
     */
    private String color;

    /**
     * @param age1 возраст животного
     * @return возвращает животное
     *         с этим возрастом
     */
    public final T setAge(final int age1) {
        this.age = age1;
        return (T) this;
    }

    /**
     * @param name1 имя животного
     * @return возвращает животное
     *         с этим именем
     */
    public final T setName(final String name1) {
        this.name = name1;
        return (T) this;
    }

    /**
     * @param color1 расцветка животного
     * @return возвращает животное
     *         с этой расцветкой
     */
    public final T setColor(final String color1) {
        this.color = color1;
        return (T) this;
    }

}