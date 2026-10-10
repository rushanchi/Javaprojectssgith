public class Encr {
    public static void main(String[] args) {
        char c1 = 'И', c2 = 'Т', c3 = 'И', c4 = 'С';

        long k = 0x2DA295B3;
        long m = 0;

        m = m | ((long) c1 << 48);
        m = m | ((long) c2 << 32);
        m = m | ((long) c3 << 16);
        m = m | (long) c4;

        long s = m ^ k;

        System.out.println("Зашифрованное сообщение " + s);

        long d = s ^ k;

        char d1 = (char) (d >> 48);
        char d2 = (char) (d >> 32);
        char d3 = (char) (d >> 16);
        char d4 = (char) d;

        System.out.println("Расшифрованное сообщение " + d1 + d2 + d3 + d4);
    }
}
