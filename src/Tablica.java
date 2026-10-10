public class Tablica {
        public static void main(String[] args) {
            boolean l0 = false;
            boolean l1 = true;
            String var1 = "-".repeat(53);
            System.out.println(var1);
            System.out.print("| var1  |");
            System.out.print(" var2  |");
            System.out.print(" &(and) |");
            System.out.print(" |(or) |");
            System.out.print(" ^(xor) |");
            System.out.println(" !=(not) |");
            System.out.println(var1);

            System.out.print("| false | false |");

            boolean k1 = l0 & l0;
            boolean k2 = l0 | l0;
            boolean k3 = l0 ^ l0;
            boolean k4 = l0 != l0;

            System.out.print(" ");
            System.out.print(k1);
            System.out.print("  |");
            System.out.print(" ");
            System.out.print(k2);
            System.out.print(" |");
            System.out.print(" ");
            System.out.print(k3);
            System.out.print("  |");
            System.out.print(" ");
            System.out.print(k4);
            System.out.println("   |");
            System.out.println(var1);

            System.out.print("| false | true  |");

            k1 = l0 & l1;
            k2 = l0 | l1;
            k3 = l0 ^ l1;
            k4 = l0 != l1;

            System.out.print(" ");
            System.out.print(k1);
            System.out.print("  |");
            System.out.print(" ");
            System.out.print(k2);
            System.out.print("  |");
            System.out.print(" ");
            System.out.print(k3);
            System.out.print("   |");
            System.out.print(" ");
            System.out.print(k4);
            System.out.println("    |");
            System.out.println(var1);

            k1 = l1 & l0;
            k2 = l1 | l0;
            k3 = l1 ^ l0;
            k4 = l1 != l0;

            System.out.print("| true  | false |");

            System.out.print(" ");
            System.out.print(k1);
            System.out.print("  |");
            System.out.print(" ");
            System.out.print(k2);
            System.out.print("  |");
            System.out.print(" ");
            System.out.print(k3);
            System.out.print("   |");
            System.out.print(" ");
            System.out.print(k4);
            System.out.println("    |");
            System.out.println(var1);

            System.out.print("| true  | true  |");

            k1 = l1 & l1;
            k2 = l1 | l1;
            k3 = l1 ^ l1;
            k4 = l1 != l1;

            System.out.print(" ");
            System.out.print(k1);
            System.out.print("   |");
            System.out.print(" ");
            System.out.print(k2);
            System.out.print("  |");
            System.out.print(" ");
            System.out.print(k3);
            System.out.print("  |");
            System.out.print(" ");
            System.out.print(k4);
            System.out.println("   |");
            System.out.println(var1);

        }
    }
