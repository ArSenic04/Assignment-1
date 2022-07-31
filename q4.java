import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt(); // Taking size of array user wants
        int[] a = new int[i];
        for (int j = 0; j < i; j++) {
            a[j] = sc.nextInt();
        }
        for (int j = 0; j < i; j++) {
            if (a[j] == 1 && a[j + 1] == 2 && a[j + 2] == 3) {
                System.out.println("true");
                break;
            } else {
                System.out.println("false");
                break;
            }
        }
    }
}