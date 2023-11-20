public class Main {
    public static void main(String[] args) {

        // option 1 : instance
        StaticMethods sm = new StaticMethods();
        int x = 2;
        System.out.println(sm.addOneInstance(x));

        // option 2: static
        int x2 = 2;
        System.out.println(StaticMethods.addOne(x2));


        // ..
        StaticMethods sm2 = new StaticMethods();
        sm2.instanceVariable = "changed";
        System.out.println(StaticMethods.getInstanceVariable((sm)));
        System.out.println(StaticMethods.getInstanceVariable((sm2)));
        System.out.println(StaticMethods.getInstanceVariable((sm)));

    }
}