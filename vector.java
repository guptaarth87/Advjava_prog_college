import java.util.*;
public class vector {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();
        vec.add("zip");
        vec.add("zap");
        vec.add("zoop");
        vec.addElement("Not");
        // vec.remove("Hello");
        System.out.println(vec);
        for(String x: vec){
            System.out.println(x);
        }
        System.out.println("printing using enumerate");
        Enumeration e = vec.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        
    }
}
