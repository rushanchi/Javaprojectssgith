public class Program7 {
    public static void main(String[] args) {

        double n = 1;
        double c = 1;
        double x = 10;
        double s = 1;

        while (true) {
            s = s * (x / n);
            c += s;
            n += 1;

            if (Math.abs(s) < 0.00001) {
                break;
            }
        }

        System.out.println("Результат: " + c);

    }
}
