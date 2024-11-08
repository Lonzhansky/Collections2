package lesson19.demos._2_searching._01_array_search;

// Пошук загальних елементів в масивах
public class ArrayCommonElement {

    public static void main(String[] args) {
        getOutput(handleData(getData1(), getData2()));
    }

    private static int[] getData1() {
        return new int[]{2, 8, 17, 29, 20, 45, 56, 159, 239};
    }

    private static int[] getData2() {
        return new int[]{8, 12, 15, 29, 22, 34, 55, 150, 159};
    }

    private static String handleData(int[] arr1, int[] arr2) {
        int arr1Index = 0;
        int arr2Index = 0;
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (arr1Index < arr1.length && arr2Index < arr2.length) {
                if (arr1[arr1Index] == arr2[arr2Index]) {
                    sb.append(arr1[arr1Index]).append(" ");
                    arr1Index++;
                    arr2Index++;
                } else {
                    if (arr1[arr1Index] < arr2[arr2Index]) {
                        arr1Index++;
                    } else {
                        arr2Index++;
                    }
                }
            } else {
                break;
            }
        }
        return sb.toString();
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}