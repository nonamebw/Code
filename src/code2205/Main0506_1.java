package code2205;

import java.util.Scanner;

/**
 * @author xuchen.pbw
 * @description
 * @date 2022/5/6
 */
public class Main0506_1 {
    public static int get(String str){
        String[] temp = str.split(" ");
        String goal = temp[temp.length-1];
        return goal.toCharArray().length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(get(str));
    }
}
