import java.util.LinkedHashSet;
import java.util.Set;

public class Utils {
    private int[][] sets;
    private static final int SET_SIZE = 6;
    private static final int MAX = 49;
    private static final int MIN = 1;

    public Utils() {}

    /**************************************************
     nazwa metody:          rollNumbers()
     opis metody:           metoda generuje n zestawów unikalnych,
                            losowych liczb oraz je wyświetla
     parametry:             int n - liczba zestawów
     zwracany typ i opis:   brak
     autor:                 000000000000
     **************************************************/
    public void rollNumbers(int n) {
        sets = new int[n][SET_SIZE];

        for (int i = 0; i < n; i++) {
            Set<Integer> rolledNumbers = new LinkedHashSet<>();
            int rolledNumber = rollNumber();
            while (rolledNumbers.size() < SET_SIZE) {
                rolledNumbers.add(rolledNumber);
                rolledNumber = rollNumber();
            }

            for (int j = 0; j < SET_SIZE; j++) {
                sets[i][j] = (int) rolledNumbers.toArray()[j];
            }
        }

        System.out.println("Zestawy wylosowanych liczb:");
        for (int i = 0; i < n; i++) {
            System.out.print("Losowanie " + (i + 1) + ": ");
            for (int j = 0; j < SET_SIZE; j++) {
                System.out.print(sets[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void countOccursOfNumbers() {
        int[] occurs = new int[MAX + 1];

        for (int i = 0; i < sets.length; i++) {
            for (int j = 0; j < SET_SIZE; j++) {
                int number = sets[i][j];
                occurs[number] += 1;
            }
        }

        for (int i = 1; i < occurs.length; i++) {
            System.out.println("Wystąpienia liczby " + i + ": " + occurs[i]);
        }
    }

    private int rollNumber() {
        return (int) ((Math.random() * (MAX - MIN + 1)) + MIN);
    }
}
