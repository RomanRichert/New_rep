import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // ƒана Map<String, String>, если в ней есть ключ СaТ и СbТ, то нужно  создать новый ключ СabТ с суммой значений от ключей a и b.

        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi ");
        map.put("b", "There");

        System.out.println(addAAndBInTheMap(map));

    }
    public static Map<String, String> addAAndBInTheMap (Map<String, String> map){
        if (map.get("a") != null && map.get("b") != null) map.put((String) map.keySet().toArray()[0]+map.keySet().toArray()[1], map.get(map.keySet().toArray()[0])+map.get(map.keySet().toArray()[1]));

        return map;
    }
}