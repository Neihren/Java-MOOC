public class Part03_01 {

    // Programming exercice: Advanced astrology
    public static void main(String[] args) {
        // printSpaces(4);
        // printTriangle(4);
        printChristmasTree(10);
    }

    public static void printSpaces(int nb) {
        for (int i = 0; i < nb; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int nb) {
        for (int i = 0; i < nb; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void printChristmasTree(int size) {
        for (int i = 0; i < size; i++) {
            printSpaces(size - i - 1);
            printStars(i * 2 + 1);
        }
        // Base
        for (int j = 0; j < 2; j++) {
            printSpaces(size - 2);
            printStars(3);
        }
    }
}