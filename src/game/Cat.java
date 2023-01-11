package game;

public class Cat {

    private final String name;
    private final int appetite; // аппетит кота в условных единицах

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        int currentNum = plate.decreaseFood(appetite);
        if (currentNum == 1) {
            System.out.println(name + " сыт");
        } else if (currentNum == 2) {
            System.out.println(name + " наелся");
        } else if (currentNum == 3) {
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
