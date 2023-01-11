import game.Cat;
import game.Plate;
import java.util.Random;
import java.util.Scanner;

public class Main {

    /**
     * 1. Доделать задачу про кота.
     * Переделать флажок true\false сытность на хранение количества текущей энергии в диапазоне от 1 до 10
     */
    static int gavSatiety = 70;
    static int murzikSatiety = 70;

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Привет! Это программа для кормления котов!");
        System.out.println("У меня есть два милых кота: Gav и Murzik!");
        System.out.println("Смотри не обижай их!");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int food = 0;

        while (true) {
            aboutCats();
            System.out.println("Сколько еды необходимо насыпать котам? В мисочке помещается 200 единиц!");
            System.out.println("Сейчас в миске " + food + " единиц из 200!");
            int catFood = sc.nextInt();
            if (catFood == 0 && food == 0) {
                System.out.println("Ты не способен кормить моих котиков! ТЫ УВОЛЕН!");
                break;
            } else if (catFood < 0) {
                System.out.println("Прекрати есть кошачий корм! ТЫ ПЛОХОЙ!");
                break;
            } else if (catFood > 200 || catFood + food > 200){
                System.out.println("Ты куда сыпешь? Не видишь миска битком! МЫ НАЙДЕМ ДРУГОГО РАБОТНИКА!");
                break;
            } else {
                catFood += food;
                food = oopDemo(catFood);
            }
        }
        sc.close();
    }

    public static int oopDemo(int catFood) {
        Plate plate = new Plate(catFood);

        Cat gav = new Cat("Gav", gavSatiety);
        gav.eat(plate);
        if(catFood >= (100 - gavSatiety)) {
            catFood -= (100 - gavSatiety);
            gavSatiety = 100;
        } else if (catFood > 0 && catFood < (100 - gavSatiety)) {
            gavSatiety += catFood;
            catFood = 0;
        }

        Cat murzik = new Cat("Murzik", murzikSatiety);
        murzik.eat(plate);
        if(catFood >= (100 - murzikSatiety)) {
            catFood -= (100 - murzikSatiety);
            murzikSatiety = 100;
        } else if (catFood > 0 && catFood < (100 - murzikSatiety)) {
            murzikSatiety += catFood;
            catFood = 0;
        }

        Random rand = new Random();
        gavSatiety -= rand.nextInt(0, 31);
        murzikSatiety -= rand.nextInt(0, 31);
        if (gavSatiety < 0) gavSatiety = 0;
        if (murzikSatiety < 0) murzikSatiety = 0;
        System.out.println(plate);
        return catFood;
    }

    private static void aboutCats() {
        System.out.println("Gav сыт на " + gavSatiety + "% из 100%");
        System.out.println("Murzik сыт на " + murzikSatiety + "% из 100%");
    }
}
