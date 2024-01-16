public class Shift {
    // shifts arr to the left by x in place
    public static void shift(Object[] arr, int x) {
        Object[] temp = new Object[arr.length];

        // fill temp
        int rightShift = arr.length - x;
        for (int i = 0; i < arr.length; i++) {
            temp[(rightShift + i) % arr.length] = arr[i];
        }

        // copy over temp
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }
}