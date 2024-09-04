import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 7,98, 3, 3, 2,14,8, 9, 10, 21, 8,1,14, 33, 9, 1, 2,98,};
        int[] repeat = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if ((list[i] % 2 == 0) && (i != j) && (list[i] == list[j])) {

                    if (!isFind(repeat, list[i])) {
                        repeat[startIndex++] = list[i];
                    }

                    break;
                }
            }
        }

        for (int value : repeat) {
            if (value != 0) {
                System.out.println(value);
            }
        }


    }
}