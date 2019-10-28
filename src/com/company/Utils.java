
/**
 * В этом классе собраны методы
 * для двух дз:
 * 1)два перегруженных метода print
 * для задания с enum,
 * 2)методы returnBox и getToObject для задания с Generics.
 *
 * @version 28.01.2019
 * @author Никита Виноградов
 *
 */

package com.company;
import java.util.Random;

final class Utils {
    /**
     * Данная константа определяет
     * размер массива
     * для метода getToObject.
     */
    private static final int ARRAY_SIZE = 3;

    /**
     * Данный конструктор является приватным
     * и ничего не делает.
     */
    private Utils() { }

    /**
     * @param text выводится в консоль
     */
    public static void print(final String text) {
        System.out.println(text);
    }

    /**
     * @param text выводится в консоль
     * @param color определяет цвет
     *            выводимого текста
     */
    public static void print(final String text, final Color color) {
        String colorR = Color.getInstance(color);
        System.out.println(colorR + text + Color.getInstance(Color.ANSI_RESET));
    }

     /**
      * @param thing определяет объект,
      *              который кладут в коробку
      * @param <T> определяет тип оюъекта
      * @return возвращает коробку с
      *         положенным в неё объектом
      */
     public static <T> Box returnBox(final T thing) {
        Box<T> box = new Box<>();
        box.setBox(thing);
        return box;
    }

     /**
      * @param one первый принимаемый объект
      * @param two второй приниаемый объект
      * @param three третий принимаемый объект
      * @param <T> определяет тип
      *          принимаемых объектов
      * @return возвращает один из
      *     принимаемых объектов
      */
     public static <T> T getToObject(final T one, final T two, final T three) {
        T[] array = (T[]) (new Object[ARRAY_SIZE]);
        array[0] = one;
        array[1] = two;
        array[2] = three;
        int index = (new Random().nextInt(array.length));
        return array[index];
    }

}
