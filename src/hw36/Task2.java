package hw36;

import javax.sound.midi.Soundbank;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.add("Luke", 55588833);
        pb.add("Mark", 55552210);
        pb.add("Mark", 29565232);
        pb.add("Mark", 55581311);

        System.out.println(pb.get("Luke"));
        System.out.println(pb.get("Mark"));
        System.out.println(pb.get("Bill"));
        System.out.println(pb);
    }
}
