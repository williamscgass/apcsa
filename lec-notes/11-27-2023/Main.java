public class Main {
    public static void main(String[] args) {

        // CASTING!!!
        // int --> double
        double d = 5.2;
        int i = 2;

        double precise_i = (double) i;
        System.out.println(precise_i);

        // double --> int
        d = 5.2;
        i = (int) d;
        System.out.println(i);


        // rounding
        System.out.println(round(4.7));
        System.out.println(round(4.5));
        System.out.println(round(4.46));

        // more rounding
        d = 7.2;
        int rounded = (int) (d + 0.5);
        System.out.println(rounded);

        d = 7.5;
        rounded = (int) (d + 0.5);
        System.out.println(rounded);

    }

    public static int round(double d) {
        int i = (int) d;
        double eval = d - i;
        if (eval >= 0.5) {
            i += 1;
        }
        return i;
    }
}