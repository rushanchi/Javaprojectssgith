import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {

        int fill = 0; // храним в каждом бите факт заполненности поля(0/1)
        int value = 0; // храним в каждом бите чем заполнено (0/1)

        int row = 0;
        int col = 0;

        for (int xod = 0; xod <= 5; xod++) {
            Scanner in = new Scanner(System.in);
            row = in.nextInt();
            col = in.nextInt();
            int shift = row * 3 - col;
            int a = 1 << shift;
            fill = fill | a;
            value = value | a;
            for (int row1 = 1; row1 <= 3; row1++) {
                for (int col1 = 1; col1 <= 3; col1++) {
                    shift = row1 * 3 - col1;
                    char c = ' ';
                    int mask = 1 << shift;
                    if ((fill & mask) > 0) {
                        if ((value & mask) > 0) {
                            c = 'x';
                        } else {
                            c = '0';
                        }
                    } else {
                        c = '_';
                    }
                    System.out.print(c);
                }
                System.out.println();
            }
            System.out.println(value);
        }
    }
}
