import java.util.*;
public class hashset {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("java");
        list.add("C++");
        list.add("C");
        list.add("Python");
        HashSet<String> set=new HashSet<>();
        set.add("MSDhoni");
        set.add("Virat");
        set.add("Rohit");
        set.add("Rishab");
        set.add("Ashwin");
        System.out.println(set);
        for(String x: set){
            System.out.println(x);
        }
        set.addAll(list);
        System.out.println(set);
        };                                                                      
    
    }
