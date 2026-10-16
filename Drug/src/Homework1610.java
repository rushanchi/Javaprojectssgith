public class Homework1610 {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11, 90, 3, 47};
        System.out.println("До сортирвоки ");

        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int last = arr.length - 1; last > 0; last--) {
            int maxind = 0;

            for (int i = 1; i <= last; i++) {
                if (arr[i] > arr[maxind]) {
                    maxind = i;
                }
            }

            int t = arr[maxind];
            arr[maxind] = arr[last];
            arr[last] = t;
        };

        System.out.println("После сортировки ");

        for (int i: arr) {
            System.out.print(i + " ");
        }
    }
}
