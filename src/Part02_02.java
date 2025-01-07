import java.util.Scanner;

public class Part02_02 {

    public static void main(String[] args) {
        Scanner scan;
        int numberOfRepeat;

        scan = new Scanner(System.in);
        
        System.out.println("How Many times ?");
        numberOfRepeat = scan.nextInt();
        while (numberOfRepeat > 0) {
            printText();
            numberOfRepeat--;
        }
        scan.close();
    }
    
    // Don't change the next line that defines the method!
    // (We aren't giving a method a parameter yet)
    public static void printText() {
        // write some code here
        System.out.println("In a hole in the ground there lived a method");
        
    }
}