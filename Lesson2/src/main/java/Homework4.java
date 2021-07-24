public class Homework4 {
    public static void main(String[] args) {
        System.out.println(max(new int[]{1, 2, 17, 88, 97}));
    }

    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;
      for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }
}
