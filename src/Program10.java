import java.util.Scanner;
import java.util.Random;

public class Program10 {
    static int fill = 0;
    static int value = 0;

    static int[] lines = {
            0b000000111, // верхняя строка
            0b000111000, // средняя строка
            0b111000000, // нижняя строка
            0b100100100, // левый столбец
            0b010010010, // средний столбец
            0b001001001, // правый столбец
            0b001010100, // диагональ осн
            0b100010001  // диагональ поб
    };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("---------------------------------------");
        System.out.println("            КРЕСТИКИ НОЛИКИ");
        System.out.println("---------------------------------------");

        boolean vashXod = true;

        while (true) {

            if (vashXod) {
                int row;
                int col;
                int shift;
                int mask;

                while (true) {
                    System.out.print("Введите строку и столбец от 1 до 3: ");
                    row = in.nextInt();
                    col = in.nextInt();

                    if (row < 1 || row > 3 || col < 1 || col > 3) {
                        System.out.println("Координаты должны быть от 1 до 3");
                        continue;
                    }

                    shift = row * 3 - col;
                    mask = 1 << shift;

                    if ((fill & mask) == 1) {
                        System.out.println("Клетка уже занята!");
                        continue;
                    }

                    fill = fill | mask;
                    value = value | mask;
                    break;
                }
            } else {
                System.out.println("Ход Компьютера");
                int shift;
                while (true) {
                    shift = random.nextInt(9);
                    if ((fill & (1 << shift)) == 0) {
                        break;
                    }
                }

                int mask = 1 << shift;
                fill = fill | mask;
            }

            field();

            int MaskForX = fill & value;
            int MaskForO = fill & ~value;

            if (win(MaskForX)) {
                System.out.println("ВЫ победили!");
                break;
            } else if (win(MaskForO)) {
                System.out.println("Победил компьютер(!");
                break;
            } else if (fill == 0b111111111) {
                System.out.println("Ничья!");
                break;
            }

            vashXod = !vashXod;
        }
    }

    static boolean win(int mask1) {
        for (int line : lines) {
            if ((mask1 & line) == line) {
                return true;
            }
        }
        return false;
    }

    static void field() {
        for (int row1 = 1; row1 <= 3; row1++) {
            for (int col1 = 1; col1 <= 3; col1++) {
                int shift = row1 * 3 - col1;
                char c = ' ';
                int mask = 1 << shift;
                if ((fill & mask) != 0) {
                    if ((value & mask) != 0) {
                        c = 'X';
                    } else {
                        c = 'O';
                    }
                } else {
                    c = '_';
                }
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
