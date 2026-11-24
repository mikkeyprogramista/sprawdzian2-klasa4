import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Utils utils = new Utils();

        System.out.println("Ile wygenerować losowań?");
        int n = readInt();

        utils.rollNumbers(n);
        utils.countOccursOfNumbers();
    }

    private static int readInt() {
        return Integer.parseInt(SCANNER.nextLine());
    }
}
