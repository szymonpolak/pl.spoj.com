import java.util.Scanner;

public class PA05_POT {
    public static void main(String[] args) {
        byte[][] repeatingLastDigitsOfPowers = {
                {0, 0, 0, 0}, // Last digits of the powers of *0 in order: exponent % 4
                {1, 1, 1, 1}, // Last digits of the powers of *1 in order: exponent % 4
                {6, 2, 4, 8}, // Last digits of the powers of *2 in order: exponent % 4
                {1, 3, 9, 7}, // Last digits of the powers of *3 in order: exponent % 4
                {6, 4, 6, 4}, // Last digits of the powers of *4 in order: exponent % 4
                {5, 5, 5, 5}, // Last digits of the powers of *5 in order: exponent % 4
                {6, 6, 6, 6}, // Last digits of the powers of *6 in order: exponent % 4
                {1, 7, 9, 3}, // Last digits of the powers of *7 in order: exponent % 4
                {6, 8, 4, 2}, // Last digits of the powers of *8 in order: exponent % 4
                {1, 9, 1, 9}  // Last digits of the powers of *9 in order: exponent % 4
        };

        Scanner sc = new Scanner(System.in);
        byte numberOfTests = sc.nextByte();
        sc.nextLine();
        String[] splittedRow;
        int base, exponent;
        while (numberOfTests > 0) {
            splittedRow = sc.nextLine().split("\\s+");
            base = Integer.valueOf(splittedRow[0]) % 10;
            exponent = Integer.valueOf(splittedRow[1]) % 4;
            System.out.println(repeatingLastDigitsOfPowers[base][exponent]);
            numberOfTests--;
        }
        sc.close();
    }
}
