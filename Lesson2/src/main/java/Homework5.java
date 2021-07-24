public class Homework5 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println(calculateHypotenuse(a = 3, b = 5));
    }

    public static double calculateHypotenuse(int a, int b) {
        return Math.hypot(a, b);
    }
}
