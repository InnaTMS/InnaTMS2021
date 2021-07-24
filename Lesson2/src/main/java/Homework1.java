public class Homework1 {
    public static void main(String[] args) {
        System.out.println(sum(150, 196));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    public static int sum(int a, int b) {
        long sum = a + (long) b;
        if (sum > Integer.MAX_VALUE) {
            return -1;
        }
        return a + b;
    }
}
