import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(12);
        s.push(11);
        s.push(3);
        s.push(89);
        s.push(90);
        s.push(45);
        System.out.println(s);
        for(Integer x: s){
            System.out.println(x);
        }
    }
}
