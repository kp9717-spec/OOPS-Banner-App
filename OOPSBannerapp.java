class BannerPrinter {

    public void printBanner() {

        System.out.println(
            " *****  " + " *****  " + " ****** " + "  ***** "
        );

        System.out.println(
            "*     * " + "*     * " + "*     * " + " *     *"
        );

        System.out.println(
            "*     * " + "*     * " + "*     * " + "*      "
        );

        System.out.println(
            "*     * " + "*     * " + " ****** " + "  ***** "
        );

        System.out.println(
            "*     * " + "*     * " + "*       " + "       *"
        );

        System.out.println(
            "*     * " + "*     * " + "*       " + "*     * "
        );

        System.out.println(
            " *****  " + " *****  " + "*       " + " *****  "
        );
    }
}

public class OOPSBannerapp {

    public static void main(String[] args) {

        BannerPrinter bp = new BannerPrinter();
        bp.printBanner();
    }
}