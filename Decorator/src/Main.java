import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Map<Integer, String> timerMap = new MapTimer(new HashMap<Integer, String>());

        timerMap.put(1,"First record");
        timerMap.put(2,"Second record");

        //Данные хранятся 5 секунд
        for (int i = 0; i < 7; i++){
            System.out.println(timerMap.get(1));
            System.out.println(timerMap.get(2));
            System.out.println();
            ((MapTimer) timerMap).timeTick();
        }
        //После 5 секунд данные становятся недоступны
        System.out.println(timerMap.get(1));
        System.out.println(timerMap.get(2));
    }
}