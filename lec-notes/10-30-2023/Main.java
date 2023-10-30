public class Main {
    public static void main(String[] args) {

        int[] numbers = { 1, 4, 6, 7, 2, 5 };

        // ITERATING WITH WHILE LOOP
        /* int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++; // i += 1, i = i + 1 are equivalent 
        }
        System.out.println("");

        i = 0;
        while (i < numbers.length) {
            numbers[i] += 1;
            if (numbers[i] == 21) {
                break;
            } 

            i++; // i += 1, i = i + 1 are equivalent 
        } */

        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            // some more code here...

            i++; // i += 1, i = i + 1 are equivalent 
        }

        System.out.println("");

       /*  for (i = 0; i < numbers.length; i++) {
            if (numbers[i] > 3) {
                continue;
            }

            numbers[i] *= i;
            System.out.println(numbers[i]);
        } */

        for (int number : numbers) {
            number = number * 2;
            if (number > 10) {
                continue;
            }

            System.out.println(number);
        }

        System.out.println("");

        i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            // some more code here...

            i++; // i += 1, i = i + 1 are equivalent 
        }
    }
}