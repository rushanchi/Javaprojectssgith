import java.math.BigInteger;

public class Kool {
    public static void main(String[] args) {
        int value = 4;
        BigInteger k = new BigInteger("1");
        for (int i = 1; i <= value; i++) {
            k = k.multiply(BigInteger.valueOf(i));
        }
    }
    public static int[] merge(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a1.length && j < a2.length) {
            if (a1[i] <= a2[j]) {
                result[k++] = a1[i++];
            } else {
                result[k++] = a2[j++];
            }
        }

        while (i < a1.length) {
            result[k++] = a1[i++];
        }

        while (j < a2.length) {
            result[k++] = a2[j++];
        }
        return result;
    }
}
