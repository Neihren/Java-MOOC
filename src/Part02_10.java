public class Part02_10 {

    //Programming exercice: Smallest
    public static void main(String[] args) {
        int anwser = smallest(2, 7);
        System.out.println("Smallest: " + anwser);
    }

    public static int smallest(int number1, int number2) {
        return(number1 < number2 ? number1 : number2);
    }
}