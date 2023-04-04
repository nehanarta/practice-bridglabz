package Day5Assignment;

public class Vowel {
    public static void main(String[] args) {
        char ch = 'm';
        switch (ch) {
            case 'a':
            case 'i':
            case 'o':
            case 'u':
            case 'e':
                System.out.println("Vowel");
            default:
                System.out.println("consonant");
        }
    }
}