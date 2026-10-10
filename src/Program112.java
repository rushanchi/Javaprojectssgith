public class Program112 {
    public static void main(String[] args) {
        String YELLOW = "\u001B[33m";
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] z = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            z[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            z[i + a.length] = b[i];
        }

        for (int i: z) {
            System.out.print(YELLOW + i + " ");
        }

    }
}
