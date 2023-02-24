import java.util.*;

public class genericclass <T>{
     private T t;
     public void add(T t){
        this.t = t;
     }
     public T Tget(){
        return t;
     }

     public static void main(String args[]){
         //  genericclass <Integer> iclass = new genericclass<>();
          genericclass <Double> dclass =new genericclass<>();
          dclass.add(new Double(25.00));
          System.out.print(dclass.Tget());
     }
}
