import java.util.Scanner;

public class Part02_02 {
    
    //Programming exercice: Reprint
    public static void main(String[] args) {
        Scanner scan;
        int numberOfRepeat;

        scan = new Scanner(System.in);
        
        System.out.println("How Many times ?");
        numberOfRepeat = scan.nextInt();
        printText(numberOfRepeat);
        scan.close();
    }

    public static void printText(int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.println("In a hole in the groud there lived a method");
        }
    }
}