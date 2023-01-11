package ru.gb.game;

import java.util.Arrays;
import java.util.Objects;

public class Cat extends Object {

    private String name;
    private final int appetite; // аппетит кота в условных единицах
    private boolean satiety; // сытность - либо сыт либо голоден
//    int energy; // энергия кота от 0 до 10

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public void eat(Plate plate) {
        if (satiety) {
            System.out.println("Кот сытый");
            return;
        }

        // TODO: 23.12.2022 Переделать логику так, чтобы кот ел сколько доступно и насыщался относительно съеденого.

        satiety = plate.decreaseFood(appetite);
        if (satiety) {
            System.out.println("Кот наелся");
        } else {
            System.out.println("Кот не поел");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return appetite == cat.appetite && name.equals(cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, appetite);
    }

    //    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof Cat)) {
//            return false;
//        }
//
//        // obj instanceOf cat
//        Cat another = (Cat) obj;
//        return name.equals(another.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }

    @Override
    public String toString() {
        return "Cat[" + name + "]";
    }
}
