import java.util.Scanner;

class Main {
    static int findSumDigitSquare(int n) {
        int sum = 0;
        int lastDigit;
        while (n > 0) {
            lastDigit = n % 10;
            sum += lastDigit * lastDigit;
            n /= 10;
        }
        return sum;
    }

    static boolean isHappy(int n) {
        if (n <= 0) {
            return false;
        }
        while (!(n == 1 || n == 4)) {
            n = findSumDigitSquare(n);
        }

        return n == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n = sc.nextInt();

        if (isHappy(n)) {
            System.out.println(n + " is a happy number");
        } else {
            System.out.println(n + " is not a happy number");
        }
    }
}