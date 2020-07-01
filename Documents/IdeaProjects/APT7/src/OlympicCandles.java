
import java.util.Arrays;
import java.util.Collections;

public class OlympicCandles {
    public int numberOfNights(int[] candles){
        int nonZero = 0;
        int days = 0;
        Integer[] candles2 = new Integer[candles.length];
        for (int in = 0; in < candles.length; in++){
            candles2[in] = candles[in];
        }
        for (int c:candles2){
            if (c != 0){
                nonZero++;
            }
        }
        while(nonZero >= days && days < candles2.length){
            Arrays.sort(candles2, Collections.reverseOrder());
            for(int n = 0; n<days; n++){
                if (candles2[n]>0){
                    candles2[n] -= 1;
                }
            }
            int count = 0;
            for (int i: candles2){
                if (i!=0){
                    count++;
                    nonZero = count;
                }
            }
            days++;
        }
        for (Integer i: candles2){
            if (i == 0){
                return days-1;
            }
        }
        return days;
    }

}