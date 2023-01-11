import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task2 {
    /**
     * 2. Создать массив (int[]) из 1000 случайных элементов от 0 до 24.
     * Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений
     * в данном массиве и верните его в виде числа с плавающей запятой (double)
     * Для вычисления процента используйте формулу:
     * процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
     */
    public static void main(String[] args) {
        int[] array = new int[1000];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(0, 25);
        }
        System.out.println(new Task2().persentageOfUniqueValues(array));
    }

    public double persentageOfUniqueValues (int[] arr) {
        Set<Integer> unique = new HashSet<>();
        for (int x : arr) {
            unique.add(x);
        }

        System.out.println(unique);
        return (double) unique.size() * 100 / arr.length;
    }
}
