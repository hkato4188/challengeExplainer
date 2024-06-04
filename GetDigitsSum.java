import java.util.Scanner;

public class GetDigitsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int userInput = scanner.nextInt();
        GetDigitsSum test = new GetDigitsSum();
        // scanner close is only needed for certain IDE's disregard if not relevant
        scanner.close();
        test.getDigitsSum(userInput);
        test.getDigitsSumWithString(userInput);
    }

    public int getDigitsSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("here is the answer by looking at each decimal place value: ");
        System.out.println(sum);
        return sum;
    }

    public int getDigitsSumWithString(int n) {
        int sum = 0;
        // We do not need absolute value because the parameters of the problem
        String numberStr = String.valueOf(n);
        for (char ch : numberStr.toCharArray()) {
            sum += Character.getNumericValue(ch);
        }
        System.out.println("here is the answer turning the input by turning the number into a string: ");
        System.out.println(sum);

        return sum;
    }
}
