package code2205;

import java.util.Scanner;

/**
 * @author xuchen.pbw
 * @description
 * @date 2022/5/6
 */
public class Main0506_2 {

    public static int get(String str, char goal){
        char[] temp = str.toCharArray();
        int count = 0;
        for (char c : temp) {
            if ( c == goal) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String goal = scanner.nextLine();
        char[] goalChar = goal.toLowerCase().toCharArray();
        System.out.println(get(str.toLowerCase(),goalChar[0]));
    }

}
