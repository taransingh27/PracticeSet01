package question9;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if (Character.isLowerCase(a)) {
            System.out.println(Character.toUpperCase(a));
        } else {
            System.out.println(Character.toLowerCase(a));
        }
    }
}
