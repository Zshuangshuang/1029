import java.util.Map;
import java.util.TreeMap;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-29
 * Time:19:05
 **/
public class TestMap {

    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>();
        map.put("Zss",111);
        System.out.println(map);
        System.out.println(map.get("Zss"));
        Integer v = map.getOrDefault("CCC",666);
        System.out.println(v);
        System.out.println(v = map.remove("ccc"));


    }
}
