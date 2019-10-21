package com.company;

public class Utils {

    public static void print (String text){
        System.out.println(text);
    }

    public static void print(String text, Color color){
        String colorR = Color.getInstance(color.toString());
        System.out.println(colorR + text + Color.getInstance("ANSI_RESET"));
    }

    public static<T> Box return_Box(T thing){
        Box<T> box = new Box<>();
        box.set_Box(thing);
        return box;
    }

    public static <T> T get_to_Object (T one, T two, T three){
        T [] array =(T[])(new Object [3]);
        array[0]=one;
        array[1]=two;
        array[2]=three;
        int index=(int) (Math.random()*3);
        return array[index];
    }

}
