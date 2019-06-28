import java.util.Scanner;

public class FCTRL3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte numberOfTests = sc.nextByte();
        while (numberOfTests > 0) {
            System.out.println(toTensAndUnities(strongLimitedTo99(sc.nextInt())));
            numberOfTests--;
        }
        sc.close();
    }

    private static int strongLimitedTo99(int n) {
        int strongResult = 1;
        int iterator = 2;
        while (iterator <= n && strongResult % 100 != 0) {
            strongResult *= iterator++;
        }
        return strongResult % 100;
    }

    private static String toTensAndUnities(int n) {
        return (n / 10) + " " + n % 10;
    }
}
