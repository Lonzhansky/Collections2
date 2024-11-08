package lesson19.demos._4_examples;

// Сортування двох масивів.
// Сортуються ціни з урахуванням одиниць виміру.
public class SortTwoArrays {

    public static void main(String[] args) {

        double[] prices = {15.99, 9.99, 15.89, 45.55, 26.67, 7.79, 18.25};
        String[] measures = {"item", "kg", "l", "item", "l", "kg", "box"};

        int len = prices.length;
        sort(prices, measures);

        for (int i = 0; i < len; i++)
            System.out.println(prices[i] +
                    " UAH/" +
                    measures[i]);
    }

    public static void sort(double[] amount, String[] measures) {

        int len = amount.length;
        double temp;
        String tem;

        for (int i = 0; i < len; i++) {
            for (int j = 1; j < (len - i); j++) {

                if (amount[j - 1] > amount[j]) {

                    temp = amount[j - 1];
                    amount[j - 1] = amount[j];
                    amount[j] = temp;

                    tem = measures[j - 1];
                    measures[j - 1] = measures[j];
                    measures[j] = tem;
                }
            }
        }
    }
}
