public class Exp {
    public static void main(String[] args) {
        double j = ctexp(10);
        System.out.println(j);
        System.out.println(cosin(3.1456294284024920492049025/2));
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

    public static double cosin(double x) {
        double c = x;
        double eps = 1e-6;
        double reg = x;
        int n = 2;
        int sign = -1;

        while ((eps < reg) || (reg < -eps)) {
            reg = reg * x * x / (n * (n + 1));
            c += reg * sign;
            sign = -sign;
            n = n + 2;
        }
        return c;
    }
}
