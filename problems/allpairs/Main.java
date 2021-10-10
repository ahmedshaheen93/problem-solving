package allpairs;
public class Main{

    public static void main(String[] args){
        int[] array ={1,2,3,4,5,6};
        int[] array2 ={6,5,4,3,2,1};
       //printAllPairs(array);
       printAllElements(array,array2);
    }

    /**
     * O(n^2) example
     * @param array
     */
    private static void printAllPairs(int[]  array ){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i]+" "+ array[j]);
            }
        }
    }
    /**
     * O(a+b) example
     * @param array
     * @param array2
     */
    private static void printAllElements(int[]  array ,int[]  array2 ){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
