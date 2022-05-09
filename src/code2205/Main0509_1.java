package code2205;


import java.util.*;

/**
 * @author xuchen.pbw
 * @description
 * @date 2022/5/9
 */
public class Main0509_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String workerTemp = scanner.nextLine();
        int worker = Integer.parseInt(workerTemp);
        List<String> fruitList = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            String[] arr = data.split(" ");
            String fruitName = arr[0];
            if (!fruitList.contains(fruitName)) {
                fruitList.add(fruitName);
            }
            int workerNo = Integer.parseInt(arr[1]);
            int weight = Integer.parseInt(arr[2]);
            if (workerNo > worker) {
                continue;
            }
            if (map.containsKey(fruitName)) {
                List<String> list = map.get(fruitName);
                for (int i = 0; i < list.size(); i++) {
                    String[] str = list.get(i).split(" ");
                    int tempWeight = Integer.parseInt(str[1]);
                    int tempNo = Integer.parseInt(str[0]);
                    if (tempNo == workerNo) {
                        continue;
                    }
                    if (tempWeight == weight) {
                        int tmpWorderNo = Integer.parseInt(str[0]);
                        if (workerNo < tmpWorderNo) {
                            list.add(i,workerNo + " " + weight);
                            break;
                        }else {
                            list.add(i+1,workerNo + " " + weight);
                            break;
                        }
                    }else if (weight < tempWeight) {
                        list.add(i,workerNo + " " + weight);
                        break;
                    }
                }
                list.add(workerNo + " " + weight);
            }else {
                List<String> list = new ArrayList<>();
                list.add(workerNo  + " " + weight);
                map.put(fruitName,list);
            }
        }

        List<String> temp = new ArrayList<>();
        for (String s : fruitList) {
            List<String> list = map.get(s);
            for (String s1 : list) {
                String out = s  + " " + s1;
                if (temp.contains(out)){
                    continue;
                }else {
                    temp.add(out);
                }
                System.out.println(out);
            }
        }
    }

}
