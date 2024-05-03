package hw44;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework44 {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> userMoneyMap = new HashMap<>();

        // read a file and sum money by users
        List<String> lines = Files.readAllLines(Paths.get("src\\hw44\\money_in.txt"));
        System.out.println(lines);
        for (String str : lines) {
            String[] fields = str.split(":");
            String userName = fields[0];
            Integer money = Integer.valueOf(fields[1]);
            Integer sum = userMoneyMap.get(userName);
            if (sum == null) {
                userMoneyMap.put(userName, 0);
                sum = 0;
            }
            userMoneyMap.put(userName, sum + money);
        }
        //write to files by conditions
        // if money less than 2_000, then less.txt, else --> more.txt
        try (FileWriter less = new FileWriter("src\\hw44\\less.txt");
             FileWriter more = new FileWriter("src\\hw44\\more.txt")) {
            for (String userName : userMoneyMap.keySet()) {
                Integer userMoney = userMoneyMap.get(userName);
                if (userMoney < 2_000) {
                    less.write(userName + ":" + String.valueOf(userMoney) + "\n");
                } else {
                    more.write(userName + ":" + String.valueOf(userMoney) + "\n");
                }
            }
        }
    }
}
