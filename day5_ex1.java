import java.util.*;
class Box <T>{
   private T item;
    Box(T item){this.item = item;}
    public T get(){return this.item;}
    public void set(T item){this.item = item;}
}
public class day5_ex1 {
    public static void main(String [] args){
        Box<Integer> obji = new Box<>(10);
        int val = obji.get();
        System.out.println("The value of integer is: " + val);
        obji.set(100);
        System.out.println("The value of integer after set is: " + obji.get());

        Box<String> objs = new Box<>("Hello");
        String vals = objs.get();
        System.out.println("The value of string is: " + vals);
        objs.set("Hello2");
        System.out.println("The value of string after set is: " + objs.get());
    }
}
