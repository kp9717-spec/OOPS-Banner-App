public class OOPSBannerappUC6 {

    public static void main(String[] args) {

        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        // Final banner array (7 lines)
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("",
                    O[i],
                    O[i],
                    P[i],
                    S[i]);
        }

        // Print using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Static method for letter O
    public static String[] buildO() {
        return new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        };
    }

    // Static method for letter P
    public static String[] buildP() {
        return new String[]{
                " ******* ",
                " *     * ",
                " *     * ",
                " ******* ",
                " *       ",
                " *       ",
                " *       "
        };
    }

    // Static method for letter S
    public static String[] buildS() {
        return new String[]{
                " ******* ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                " ******* "
        };
    }
}