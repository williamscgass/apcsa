import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // BEFORE CLASS ///////////////////////////////
        Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int[][] arr2d = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] arr2d2 = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
    };

        // shifting a 1d array
        Shift.shift(arr, 2);
        System.out.println(Arrays.deepToString(arr));

        shift(arr2, 2);
        for (int e: arr2) {
            System.out.print(e);
        }

        System.out.println();



        // shifting a 2d array
        Shift.shift(arr2d, 1);
        System.out.println(Arrays.deepToString(arr2d));


        // DURING CLASS ////////////////////////////////
        shift2d(arr2d2, 1);
        System.out.println(Arrays.deepToString(arr2d2));
    }

    public static void shift(int[] arr, int x) {
        int[] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[(i + x) % arr.length];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }

    public static void shift2d(int[][] arr, int x) {
        int[][] temp = new int[arr.length][];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[(i + x) % arr.length];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }
}
