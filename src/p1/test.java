package p1;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean c = false;
        do {
            System.out.print("Enter Digit : ");
            int a = 0;
            try {
                a = sc.nextInt();
            } catch (Exception e) {
                System.out.println(e);
                c = true;
            }
            System.out.println(a);
        } while (c);
    }
}
// try {
// System.out.print("Enter Digit : ");
// a = sc.nextInt();
// } catch (Exception e) {
// System.out.println(e);
// System.out.print("Enter Digit : ");
// a = sc.nextInt();
// break;
// }