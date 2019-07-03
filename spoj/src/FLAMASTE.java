import java.util.Scanner;

public class FLAMASTE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte numberOfTests = sc.nextByte();
        sc.nextLine();
        while (numberOfTests > 0) {
            shorterVersionOfWord(sc.nextLine());
            numberOfTests--;
        }
    }

    private static void shorterVersionOfWord(String word) {
        StringBuilder sb = new StringBuilder(20);
        int wordLength = word.length();
        int position = 0;
        int numberOfOccurrences = 1;
        while (wordLength > position) {
            while (wordLength > position + numberOfOccurrences && word.charAt(position) == word.charAt(position + numberOfOccurrences)) {
                numberOfOccurrences++;
            }
            switch (numberOfOccurrences) {
                case 1:
                    sb.append(word.charAt(position));
                    break;
                case 2:
                    sb.append(word.charAt(position));
                    sb.append(word.charAt(position));
                    break;
                default:
                    sb.append(word.charAt(position));
                    sb.append(numberOfOccurrences);
                    break;
            }
            position += numberOfOccurrences;
            numberOfOccurrences = 1;
        }
        System.out.println(sb.toString());
    }
}
