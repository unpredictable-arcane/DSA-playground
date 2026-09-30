import java.util.Scanner;

class CaseCheck {
    public static void main(String[] args) {
        Scanner letter = new Scanner(System.in);
        char ch = letter.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }

    }
}
