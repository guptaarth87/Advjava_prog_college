import java.util.*;

public class treeset {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Java");
        set.add("C++");
        set.add("C");
        set.add("Python");
        System.out.println(set);
        for (String x : set) {
            System.out.println(x);
        }
        System.out.println(set.first());
        System.out.println(set.last());
    }

    

}
