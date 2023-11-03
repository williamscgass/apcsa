public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 3, 2, 12, 5, 6, 1};

        for (Object o : arr) {
            System.out.println(o);
        }
        System.out.println("");
        ReverseArray.reverse(arr);

        for (Object o : arr) {
            System.out.println(o);
        }

        String[] arr2 = {"hello", "my", "name", "is", "will", ":)"};

        System.out.println("");
        for (Object o : arr2) {
            System.out.println(o);
        }
        System.out.println("");
        ReverseArray.reverse(arr2);

        for (Object o : arr2) {
            System.out.println(o);
        }
    } 
}
