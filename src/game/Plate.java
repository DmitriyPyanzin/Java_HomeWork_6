package game;

public class Plate {

    private int currentFood; // количество еды, которое есть на текущий момент в тарелке

    public Plate(int currentFood) {

        this.currentFood = currentFood;
    }

    public int decreaseFood(int appetite) {
        if (appetite == 100) {
            return 1;
        } else if (currentFood >= (100 - appetite)) {
            currentFood -= (100 - appetite);
            return 2;
        } else if (currentFood > 0 && currentFood < (100 - appetite)) {
            currentFood = 0;
            return 3;
        } else {
            return 4;
        }
    }

    @Override
    public String toString() {

        return "Еды осталось [" + currentFood + "]";
    }
}
