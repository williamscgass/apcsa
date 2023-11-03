public class ReverseArray {
    public static void reverse(Object[] arr) {
        
        int upperBound = arr.length / 2;
        for (int i = 0; i < upperBound; i++) {
            Object temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp; 
        }
    }
}
