import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        short pop = 5;
        short ug = 45;
        System.out.println("Введи число от 0 до 100");
        while (pop >= 1) {
            int num = in.nextInt();
            pop -= 1;
            if (pop == 0) {
                System.out.println("Вы проиграли попытки закончились");
                break;
            }
            if (num < ug) {
                System.out.println("Загаданное число больше");
            } else if (num > ug) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Вы угадали");
                break;
            }


        }


    }

}
