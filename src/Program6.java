public class Program6 {
    public static void main(String[] args) {
        int x = 11;
        for (int i = 1; i <= x; i+=2) {
            String prob1 = " ".repeat((x - i) / 2);
            String s = "#".repeat(i);
            System.out.println(prob1 + s + prob1);
        }

        for (int l = x; l >= 1; l-=2) {
            String prob1 = " ".repeat((x-l) / 2);
            String s = "#".repeat(l);
            System.out.println(prob1 + s + prob1);
        }
    }
}
