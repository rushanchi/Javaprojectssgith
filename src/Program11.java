public class Program11 {
    public static void main(String[] args) {
        String RED = "\u001B[31m";
        String YELLOW = "\u001B[33m";
        String BLUE = "\u001B[34m";
        int[] a = {2, 3, 44, 21, 34, 5454, 12};
        int max1 = a[0];
        int min1 = a[0];
        double summa = 0;

        for (int i: a) {
            summa += i;
            if (i > max1) {
                max1 = i;
            }

            if (i < min1) {
                min1 = i;
            }
        }
        System.out.println(RED + max1);
        System.out.println(YELLOW + min1);
        System.out.println(BLUE + summa / a.length);
    }
}
