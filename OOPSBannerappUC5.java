public class OOPSBannerappUC5 {

    public static void main(String[] args) {

        // Array declaration + initialization in one statement
        String[] lines = {
                String.join("",
                        "  *****  ",
                        "  *****  ",
                        " ******* ",
                        " ******* "),

                String.join("",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        " *     * "),

                String.join("",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        " *       "),

                String.join("",
                        " *     * ",
                        " *     * ",
                        " ******* ",
                        "  *****  "),

                String.join("",
                        " *     * ",
                        " *     * ",
                        " *       ",
                        "       * "),

                String.join("",
                        " *     * ",
                        " *     * ",
                        " *       ",
                        " *     * "),

                String.join("",
                        "  *****  ",
                        "  *****  ",
                        " *       ",
                        "  *****  ")
        };

        // Enhanced for loop to print
        for (String line : lines) {
            System.out.println(line);
        }
    }
}