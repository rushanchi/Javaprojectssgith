public class Test {
    public static boolean main(String[] args) {
        String k = " hello *&/";
        String k1 = k.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String k2 = new StringBuilder(k1).reverse().toString();
        return k2.equals(k1);
    }
}
