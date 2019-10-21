package com.company;

public class Box<T> {
    T box_space;
    T copy_box_space;

    public void set_Box(T thing) {
        if (box_space == null) box_space = thing ;
        else System.out.println("Коробка заполнена, выньте или удалите вещь из коробки");
    }

    public T get_Box() {
        if (box_space == null) {System.out.println("В коробке ничего нет"); return null;}
        else{
            copy_box_space = box_space;
            box_space = null;
            return copy_box_space;
        }
    }

    public  void delete_Box(){
        if (box_space == null) System.out.println("Удалять нечего, коробка пуста");
        else box_space= null;
    }
}
