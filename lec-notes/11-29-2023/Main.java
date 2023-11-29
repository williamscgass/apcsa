public class Main {
    public static void main(String[] args) {
        printExpensive(3);
        printExpensive(7);
        printExpensive(11);
    }

    public static void printExpensive(int p) {

        if (p > 10) {
            System.out.println("very expesnive");
        }

        else if (p > 5) {
            System.out.println("expesnive");
        }

        else {
            System.out.println("cheap");
        }
    }
}