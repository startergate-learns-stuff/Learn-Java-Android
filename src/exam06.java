// try-catch
public class exam06 {
    public static void main(String[] args) {
        int num1 = 100, num2 = 0;

        try {
            System.out.println(num1 / num2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
