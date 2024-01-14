public class Assign4_1 {

    private static int staticVariable = 24;


    public static int getStaticVariable() {
        return staticVariable;
    }

    public static void main(String[] args) {

        System.out.println("Static Variable: " + Assign4_1.staticVariable);

        int result = Assign4_1.getStaticVariable();
        System.out.println("Result from static method: " + result);
    }
}