import java.util.*;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Messi");
        list.add("Ronaldo");
        list.add("Mbappe");
        list.add("Neymar");
        list.add("Maradona");
        list.add("Ronaldinho");
        list.add("Sunil");
        System.out.println(list);
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());
        System.out.println(list);
        ListIterator<String> iteratorNames = list.listIterator();
        while (iteratorNames.hasNext()) {
            System.out.println(iteratorNames.next());
        }
    }
    
    
}
