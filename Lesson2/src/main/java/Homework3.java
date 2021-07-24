public class Homework3 {
    public static void main(String[] args) {
        System.out.println(average(new int[]{3, 8, 11, 13, 47}));
    }
    public static double average(int[] array) {
        int mass[] = {3, 8, 11, 13, 47};
        if (mass != null && mass.length > 0) {
            double sum = 0;
            for (int j = 0; j < mass.length; j++) {
                sum += mass[j];
            }
            return sum / mass.length;
        }
        return 0;
    }
}
