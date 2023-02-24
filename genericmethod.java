public class genericmethod {
    public static <T> void printArray(t[] i){
        for (T element : i){
            System.out.print("%s",i);
        }
    }
    public static void main(String args[]){
        Integer []a = {1,2,3};
        Double []d = {1.1,2.1,1.3};
        System.out.print("Int array");
        printArray(a);
        System.out.print("double array");
        printArray(d);
    }
}
