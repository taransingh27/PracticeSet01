package question1;

import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        String userName = Scn.nextLine().trim();
        System.out.println("Welcome, " + userName + "!");
        Scn.close();
    }

}
