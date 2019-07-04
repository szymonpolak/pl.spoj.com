import java.util.Scanner;

public class PRZEDSZK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte numberOfTests = sc.nextByte();
        sc.nextLine();
        String[] splittedRow;
        while (numberOfTests > 0) {
            splittedRow = sc.nextLine().split(" ");
            System.out.println(Integer.valueOf(splittedRow[0]) / nwd(Integer.valueOf(splittedRow[0]), Integer.valueOf(splittedRow[1])) * Integer.valueOf(splittedRow[1]));
            numberOfTests--;
        }
    }

    static private int nwd(int number1, int number2) {
        if (number2 != 0) return nwd(number2, number1 % number2);
        else return number1;
    }
}
