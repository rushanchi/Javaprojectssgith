public class Massiv {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(index(a, 10));
    }

    public static int index(int[] array, int x) {
        for (int i = 0; i < array.length; i ++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
