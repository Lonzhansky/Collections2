package lesson16.demos._03_Anonymous_Class._02;


public class Main02 {

    static Summariser summariser;
    static double sum;

    public static void main(String[] args) {

        int[] nums = new int[]{3, 6, 2, 9, 7};

        // Лямбда
        summariser = arr -> {
            int count = 0;
            for (int num : arr) {
                count++;
                sum += num;
                System.out.println(count +
                        ") value is " + num);
            }
            return sum;
        };

        sum = summariser.summarise(nums);
        System.out.println("Result is " + sum);

    }
}
