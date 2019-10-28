
/**
 * Данный класс наследуется от класса Animal.
 *
 * @version 28.01.2019
 * @author Никита Виноградов
 *
 */
package com.company.Generics_three;

 public class Panda extends Animal<Panda> {
     /**
      * длина панды.
      */
     private int length;
     /**
      * скорость, которую
      * развивает панда.
      */
     private int speed;

     /**
      * @param length1 длина панды
      * @return возвращает панду с этой длиной
      */
     public final Panda setLength(final int length1) {
        this.length = length1;
        return this;
    }

     /**
      * @param speed1 скорость панды
      * @return возвращает панду,
      *         которая развивает
      *         эту скорость
      */
     public final Panda setSpeed(final int speed1) {
        this.speed = speed1;
        return this;
    }

}
