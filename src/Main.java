import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Map map = new TreeMap() {{
            put(0, "0");
            put(1, "1");
            put(4, "4");
            put(8, "8");
            put(9, "9");
            put(6, "6");
            put(1938, "1938");
            put(2, "2");
            put(3, "3");
            put(10, "10");
            put(5, "5");
            put(7, "7");
        }};
        // Sort map by value and return with TreeMap or LinkedHashMap

        map.entrySet().stream()
                .sorted(Map.Entry.<Integer, String>comparingByValue())
                .forEach(System.out::println);
    }

    public void Main() {
        Map<Integer, String> map = new TreeMap<>();
        map.entrySet().stream()
                .sorted(Map.Entry.<Integer, String>comparingByValue())
                .collect(java.util.stream.Collectors.toMap(Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, java.util.LinkedHashMap::new));
    }
}