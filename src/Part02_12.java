public class Part02_12 {

    // Programming exercice: Averaging
    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }

    public static int sum(int nb1, int nb2, int nb3, int nb4) {
        return(nb1 + nb2 + nb3 + nb4);
    }

    public static double average (int nb1, int nb2, int nb3, int nb4) {
        ;
        return((double)sum(nb1, nb2, nb3, nb4) / 4);
    }
}