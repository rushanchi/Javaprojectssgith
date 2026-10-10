public class Exp {
    public static void main(String[] args) {
        double j = ctexp(10);
        System.out.println(j);
    }

    public static double ctexp(double x) {

        double c = 1;
        double n = 1;
        double s = 1;

        while (true) {
            s = s * (x/n);
            c += s;
            n += 1;

            if (Math.abs(s) < 0.0001) {
                break;
            }

        }
        return c;
    }
}
