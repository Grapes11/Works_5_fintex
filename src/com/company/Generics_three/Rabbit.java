
/**
 * Данный класс наследуется от класса Animal.
 *
 * @version 28.01.2019
 * @author Никита Виноградов
 *
 */
package com.company.Generics_three;

import com.sun.xml.internal.ws.dump.MessageDumping;

public class Rabbit extends Animal<Rabbit> {
     /**
      * длина кролика.
      */
    private int length;
     /**
      * скорость, которую
      * кролик развивает.
      */
    private int speed;

     /**
      * @param length1 длина кролика
      * @return возвращает кролика
      *         с этой длинной
      */
    public final Rabbit setLength(final int length1) {
        this.length = length1;
        return this;
    }

     /**
      * @param speed1 скорость кролика
      * @return возвращает кролика,
      *         который развивает
      *         эту скорость
      */
    public final Rabbit setSpeed(final int speed1) {
        this.speed = speed1;
        return this;
    }

}