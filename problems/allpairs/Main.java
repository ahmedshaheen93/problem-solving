package allpairs;
public class Main{
    public static void main(String[] args){
        int[] array ={1,2,3,4,5,6};
       printAllPairs(array);
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
}
