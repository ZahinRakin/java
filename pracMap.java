import java.util.*;

public class pracMap {
    public static void main(String []args){
        Map<String, Integer> list = new HashMap<>();
        list.put("rakin", 1);
        list.put("sakib", 1);
        list.put("rakin",0);
        list.put("kaku",3);
        System.out.println(list);
    }
}
