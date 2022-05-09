package code2205;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author xuchen.pbw
 * @description
 * @date 2022/5/8
 */
public class Main0508_1 {

    public static void get(String str){
        String[] move = str.split(";");
        ArrayList startWith = new ArrayList();
        startWith.add('W');
        startWith.add('S');
        startWith.add('A');
        startWith.add('D');
        int[] result = new int[2];
        for (int i = 0; i < move.length; i++) {
            if (move[i] == null || move[i].equals("") || move[i].length() > 3 || move[i].length() < 2) {
                continue;
            }
            char command = move[i].charAt(0);
            String position = move[i].substring(1);
            int transPosition = -1;
            try {
                transPosition = Integer.parseInt(position);
            }catch (Exception e){

            }
            if (!startWith.contains(command)
                    || transPosition == -1 || transPosition < 0 || transPosition > 100) {
                continue;
            }

            if (command == 'W') {
                result[0] = result[0] + transPosition;
            }else if (command == 'S') {
                result[0] = result[0] - transPosition;
            }else if (command == 'A') {
                result[1] = result[1] - transPosition;
            }else if (command == 'D') {
                result[1] = result[1] + transPosition;
            }
        }
        System.out.println(result[0] + "," + result[1]);
    }


    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String inStr = scanner.nextLine();
        get("A10;S20;W10;D30;X;A1A;B10A11;;A10;");
//        get(inStr);
    }
}
