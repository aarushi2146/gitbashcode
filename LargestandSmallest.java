import java.util.Scanner;

public class LargestandSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five 3-digit numbers:");

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 1; i <= 5; i++) {
            int number;
            while (true) {
                System.out.print("Enter number " + i + ": ");
                number = scanner.nextInt();
                if (number >= 100 && number <= 999) {
                    break;
                } else {
                    System.out.println("Please enter a valid 3-digit number.");
                }
            }

            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}
