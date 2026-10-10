public class Program3 {
    public static void main(String[] args) {
        int x = 1;
        int y = 3;
        int z;
        char c1 = 'a';
        char c2 = 'b';
        boolean b = false;
        b = (z = c2 - c1++) == 1 ^ true;
        System.out.println(b);
        b = (x++ - --y) * (x-- + --y) == 0 || !(z == 2);
        System.out.println(b);
        z = ++x % y - z * 2 & 0b00001011;
        System.out.println(z);

    }
}
