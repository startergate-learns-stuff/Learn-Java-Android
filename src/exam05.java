public class exam05 {
    static int var = 100;
    public static void main(String[] args) {
        int var = 0;
        System.out.println(var);

        int sum = addFunction(10, 20);
        System.out.println(sum);;
    }

    private static int addFunction(int num1, int num2) {
        int hap = num1 + num2;
        return hap;
    }
}
