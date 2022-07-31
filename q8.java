import java.util.*;

public class q8 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of student : ");
        int sn = obj.nextInt();
        System.out.print("Enter the number of Question : ");
        int qn = obj.nextInt();
        String[][] arr = new String[sn][qn];
        for (int i = 0; i < sn; i++) {
            System.out.print("Student " + i + " : ");
            for (int j = 0; j < qn; j++) {
                arr[i][j] = obj.next();
            }
        }
        System.out.println("Enter the Key of all Qustions : ");
        String[] key = new String[qn];
        for (int i = 0; i < qn; i++) {
            key[i] = obj.next();
        }
        int b[] = new int[sn];
        for (int i = 0; i < sn; i++) {
            int c = 0;
            for (int j = 0; j < qn; j++) {
                if (arr[i][j].equals(key[j])) {
                    c++;
                    b[i] = c;
                }
            }
        }
        // System.out.println(c);
        for (int i = 0; i < sn; i++) {
            System.out.println("Student " + i + " : " + b[i]);
        }
        obj.close();
    }
}