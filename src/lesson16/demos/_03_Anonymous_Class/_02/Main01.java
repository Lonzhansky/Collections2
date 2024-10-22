package lesson16.demos._03_Anonymous_Class._02;


public class Main01 {

    static Summariser summariser;
    static double sum;

    public static void main(String[] args) {

        int[] nums = new int[]{3, 6, 2, 9, 7};

        // Коли реалізуємо функціональний інтерфейс,
        // можемо реалізувати його як анонімний клас.
        // АЛЕ отримуємо попередження про заміну на лямбду
        summariser = new Summariser() {
            @Override
            public double summarise(int[] arr) {
                int count = 0;
                for (int num : arr) {
                    count++;
                    sum += num;
                    System.out.println(count +
                            ") value is " + num);
                }
                return sum;
            }
        };

        sum = summariser.summarise(nums);
        System.out.println("Result is " + sum);

    }
}
