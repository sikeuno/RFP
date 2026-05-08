import java.util.Scanner;

public class Units {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number == 1) {
            System.out.println("Unit");
        } else if (number == 10) {
            System.out.println("Ten");
        } else if (number == 100) {
            System.out.println("Hundred");
        } else if (number == 1000) {
            System.out.println("Thousand");
        } else {
            System.out.println("Enter a number only 1/10/100/1000");
        }

        input.close();
    }
}
