package question8;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int b = sc.nextInt();
        if (a == 'f') {
            if (b >= 1 && b <= 58) {
                System.out.println("8.2%");
            } else {
                System.out.println("9.2%");
            }
        } else {
            if (b >= 1 && b <= 58) {
                System.out.println("8.4%");
            } else {
                System.out.println("10.5%");
            }
        }
    }

}
