public class StaticMethods {

    public static String name = "Will";
    public String instanceVariable = "original";

    public static String getName() {
        return name;
    }

    public static String getInstanceVariable(StaticMethods sm) {
        return sm.instanceVariable;
    }

    public static int addOne(int x) {
        return x + 1;
    }

    public int addOneInstance(int x) {
        return x + 1;
    }
}
