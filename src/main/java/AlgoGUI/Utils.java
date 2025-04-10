
package AlgoGUI;

import java.util.Random;

public class Utils {
    
    public static int[] generateRandomArr(int size, int maxValue) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i=0;i<size;i++) {
            arr[i] = rand.nextInt(maxValue) + 1;
        }
        return arr;
    }
    
}
