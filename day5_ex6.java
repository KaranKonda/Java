import java.util.*;

public class day5_ex6 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 25);
        map.put(2, 30);
        map.put(3, 20);
        int arr[] = new int[3];
        for(int i = 0; i < arr.length; i++ ){
            arr[i] = map.get(i+1);
        }
for (int i=0;i<arr.length;i++) {
    System.out.println(arr[i]);
}
    }
}
