import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        while (number > 0) {
            sum += number;
            number--;
        }
        System.out.println(sum);
        input.close();
    }
}
