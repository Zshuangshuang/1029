import java.util.Map;
import java.util.TreeMap;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-29
 * Time:19:58
 **/
public class MapDemo {

    public static void main(String[] args) {
        Map<String,String>  map = new TreeMap<>();
        map.put("花和尚","鲁智深");
        map.put("行者","武松");
        map.put("及时雨","宋江");
        map.put("智多星","吴用");
        System.out.println(map.get("智多星"));
        System.out.println(map.getOrDefault("青面兽", "杨志"));
        for (Map.Entry<String,String> e : map.entrySet()) {
            System.out.print(e.getKey()+": " +e.getValue()+"    ");

        }
        System.out.println();
        System.out.println(map);
    }
}
