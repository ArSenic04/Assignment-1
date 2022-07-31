import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        // String str = "example";
        char[] ch = a.toCharArray(); // To convert String from array
        for (int i = 0; i < 2; i++) { // To check first two character
            if (ch[i] == 'o') {
                System.out.println("o");
            } else if (ch[i] == 'z') {
                System.out.println("z");
            }
        }
    }
}
