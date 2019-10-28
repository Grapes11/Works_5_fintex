
/**
 * Данный класс называется Box (коробка).
 * В нем собраны все методы, которые
 * мы можем применять к коробке и
 * объектам, лежащим в ней.
 *
 * @version 28.01.2019
 * @author Никита Виноградов
 *
 */

package com.company;

final class Box<T> {
    /**
     * данная переменная характеризует
     * объект, помещенный в коробку.
     */
    private  T boxSpace;


    /**
     * Данный метод, позволяет
     * положить объект в коробку.
     * @param thing объект, который
     *              кладется в коробку
     */
    void setBox(final T thing) {
        if (boxSpace == null) {
            boxSpace = thing;
        } else {
            System.out.println("Коробка заполнена, "
                    + "выньте или удалите "
                    + "объект из коробки");
        }
    }

    /**
     * Данный метод возвращает
     * объект из коробки.
     * @return возвращет объект,
     * который находится в коробке
     */
     public T getBox() {
        if (boxSpace == null) {
            System.out.println("В коробке ничего нет");
            return null;
        } else {
            T copyBoxSpace = boxSpace;
            boxSpace = null;
            return copyBoxSpace;
        }
    }

    /**
     * Данный метод удаляет объект из коробки.
     */
     public void deleteBox() {
        if (boxSpace == null) {
            System.out.println("Удалять нечего, "
                    + "коробка пуста");
        } else {
            boxSpace = null;
        }
    }
}
