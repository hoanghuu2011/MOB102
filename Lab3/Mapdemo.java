package Lab3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author HOANG HUU
 */
public class Mapdemo {

    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<>();
        Student sv = new Student("Tuan", "CNTT", 7.0);
        map.put(sv.getName(), sv);
        Set<String> keys = map.keySet();
        for (String name : keys) {
            Student sv1 = map.get(name);
            System.out.println("Ho va ten: " + sv1.getName());
            System.out.println("Hoc luc: " + sv1.getHocLuc());
        }
    }
}
