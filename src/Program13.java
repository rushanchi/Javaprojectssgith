public class Program13 {
    public static void main(String[] args) {
        String R = "\u2588";

        int W = 0xFFFFFF; // белый
        int K = 0x000000; // чёрный
        int P = 0xB5A5A0; // серый
        int N = 0xFF7090; // розовый

        int[][] colors = {
                {W,W,W,W,W,W,W,W,W,W,W,W,W},
                {W,W,K,K,W,W,W,W,W,K,K,W,W},
                {W,W,K,P,K,W,W,W,K,P,K,W,W},
                {W,W,K,W,P,K,K,K,P,W,K,W,W},
                {W,W,K,W,P,P,P,P,P,W,K,W,W},
                {W,K,P,P,P,P,P,P,P,P,P,K,W},
                {W,K,P,P,P,P,W,P,P,P,P,K,W},
                {W,K,P,P,K,P,W,P,K,P,P,K,W},
                {W,K,P,P,K,W,W,W,K,P,P,K,W},
                {W,W,K,P,W,W,N,W,W,P,K,W,W},
                {W,W,W,K,K,K,K,K,K,K,W,W,W},
                {W,W,W,W,W,W,W,W,W,W,W,W,W},
        };

        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++) {
                int c = colors[i][j];
                int r = c >> 16;
                int g = c >> 8 & 0xff;
                int b = c & 0xff;
                System.out.print("\u001B[38;2;" + r + ";" + g + ";" + b + "m" + R);
            }
            System.out.println();
        }

    }
}
