import java.util.Scanner;

public class PRIME_T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTests = sc.nextInt();
        short numberToCheck;
        while (numberOfTests > 0) {
            numberToCheck = sc.nextShort();
            if (isPrime(numberToCheck) && numberToCheck >= 2) System.out.println("TAK");
            else System.out.println("NIE");
            numberOfTests--;
        }
        sc.close();
    }

    private static boolean isPrime(short numberToCheck) {
        for (int i = 2; i * i <= numberToCheck; i++) {
            if (numberToCheck % i == 0) return false;
        }
        return true;
    }
}
