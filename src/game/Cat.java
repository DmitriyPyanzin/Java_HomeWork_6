package game;

import java.util.Objects;

public class Cat {

    private final String name;
    private final int appetite; // аппетит кота в условных единицах

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (plate.decreaseFood(appetite) == 1) {
            System.out.println(name + " сыт");
        } else if (plate.decreaseFood(appetite) == 2) {
            System.out.println(name + " наелся");
        } else if (plate.decreaseFood(appetite) == 3) {
            System.out.println(name + " не доел");
        } else {
            System.out.println(name + " остался совсем голодный");
        }
    }

    @Override
    public String toString() {

        return "Cat [" + name + "]";
    }
}
