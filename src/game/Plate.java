package ru.gb.game;

public class Plate {

    private int currentFood; // количество еды, которое есть на текущий момент в тарелке

    public Plate(int currentFood) {
        this.currentFood = currentFood;
    }

    public boolean decreaseFood(int foodCount) {
        if (currentFood >= foodCount) {
            currentFood -= foodCount;
            return true;
        }

        return false;
    }

}
