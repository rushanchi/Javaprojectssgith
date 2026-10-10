public class Program5 {
    public static void main(String[] args) {
        int n = 100;

        for (int p = 2; p <= n; p++) {
            boolean simple = true;

            for (int i = 2; i < p/2.0; i++) {
                if (p % i == 0) {
                    simple = false;
                    break;
                }
            }

            if (simple) {
                System.out.print(p + " ");
            }
        }
    }
}
