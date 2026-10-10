public class Program7 {
    public static void main(String[] args) {
        long start = System.nanoTime();

        double n = 1;
        double c = 1;
        double x = -1;
        double s = 1;

        while (true) {
            s = s * (x / n);
            c += s;
            n += 1;

            if (Math.abs(s) < 0.00001) {
                break;
            }
        }

        long end = System.nanoTime();

        System.out.println("Результат: " + c);
        System.out.println("Время: " + (end - start) + " нс");

    }
}
