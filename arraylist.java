import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class arraylist
{
    public static void main(String args[]) 
    {
     List l = new ArrayList();
     l.add("10");
     l.add("Deepak");
     l.add("Rahul");
     Iterator itr= l.iterator();
     while(itr.hasNext())
     
         System.out.println(itr.next());
    
    }
}
