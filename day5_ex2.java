public class day5_ex2 {
    public static <T> T firstelement(T[] array){
        if(array == null || array.length == 0){
            return null;
        }
        return array[0];
    }
    public static void main(String []args){
        Integer[] array = {1,2,3,4,5};
        System.out.println("First value in Integer array is: " + firstelement(array));
    }
}
