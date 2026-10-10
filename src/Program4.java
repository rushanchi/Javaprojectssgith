public class Program4 {
    public static void main(String[] args) {
        double a = 12;
        double x = a;
        int i = 0;

        while (i < 20) {
            i++;
            x = (x + a/x) / 2;
        }
        System.out.println(x);

    }
}
