import java.util.Scanner;

public class EUCGAME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte numberOfTests = sc.nextByte();
        sc.nextLine();
        String[] numberOfTokens;
        int playerTokensA, playerTokensB;
        while (numberOfTests > 0) {
            numberOfTokens = sc.nextLine().split("\\s+");
            playerTokensA = Integer.valueOf(numberOfTokens[0]);
            playerTokensB = Integer.valueOf(numberOfTokens[1]);
            while (playerTokensA > 0 && playerTokensB > 0 && playerTokensA != playerTokensB) {
                if (playerTokensA > playerTokensB) playerTokensA -= playerTokensB;
                else playerTokensB -= playerTokensA;
            }
            System.out.println(playerTokensA + playerTokensB);
            numberOfTests--;
        }
    }
}
