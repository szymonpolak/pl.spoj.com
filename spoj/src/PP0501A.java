import java.util.Scanner;

public class PP0501A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTests = sc.nextInt();
        sc.nextLine();
        String row;
        String[] splittedRow;
        while (numberOfTests > 0) {
            row = sc.nextLine();
            splittedRow = row.split("\\s+");
            System.out.println(nwd(Integer.valueOf(splittedRow[0]), Integer.valueOf(splittedRow[1])));
            numberOfTests--;
        }
    }

    static private int nwd(int number1, int number2) {
        if (number2 != 0) return nwd(number2, number1 % number2);
        else return number1;
    }
}
