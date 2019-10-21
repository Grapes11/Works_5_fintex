package com.company;


import com.company.Generics_three.Panda;
import com.company.Generics_three.Rabbit;

import static com.company.Color.*;

public class Main {

    public static void main(String[] args) {
        //первое задание с enum
       Utils.print("Это красный цвет", ANSI_RED);
       Utils.print("Это зеленый цвет", ANSI_GREEN);
       Utils.print("А этот цвет не угадаешь",Color.getColor());

        //второе задание c Generics часть 1
       Box<String> box = new Box<>();
       box.set_Box("кубик");
       box.set_Box("ручка");
       System.out.println("Сейчас в коробке: "+box.box_space);
       String b = box.get_Box();
       System.out.println("Вещь, взятая из коробки: "+b);
       System.out.println("Сейчас в коробке: "+box.box_space);
       box.set_Box("ручка");
       System.out.println("Сейчас в коробке: "+box.box_space);
       box.delete_Box();
       System.out.println("В уоробке после удаления: "+box.box_space);

        //второе задание c Generics часть 2
       Object p = Utils.<Object>get_to_Object("карандаш",2019,"ленивец");
       System.out.println(p);

       Box h = Utils.<String>return_Box("мяч");
       System.out.println(h.box_space);

         //третье задание с Generics
       Rabbit rabbit = new Rabbit();
       rabbit.setAge(8).setColor("Grey").setLength(12).setSpeed(10).setName("Funtic");

       Panda panda = new Panda();
       panda.setAge(15).setColor("White-Black").setLength(50).setSpeed(3).setName("Sonya");
    }
}
