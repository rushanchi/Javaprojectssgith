public class Program61 {
    public static void main(String[] args) {
        int rad = 10;
        for (int y = -rad; y <= rad; y++) {
            for (int x = -rad; x <= rad; x++) {

                if (x*x + y*y <= rad*rad) {
                    System.out.print("#");
                    break;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
