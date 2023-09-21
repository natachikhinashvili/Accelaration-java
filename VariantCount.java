import java.util.ArrayList;
import java.util.List;

public class VariantCount {

    public static int countVariants(int stairsCount){
        if(stairsCount < 0){
            return 0;
        }else if(stairsCount <= 2){
            return stairsCount;
        }

        //array to store number of ways to climb stairs
        List<Integer> result =  new ArrayList<>();
        result.add(1);
        result.add(2);

        /* 
            using recurrence relation(result[i]=result[i - 1]+result[i - 2]) 
            loop calculates another number of way to climb stairs(result[i])    
        */
        for (int i = 3; i <= stairsCount; i++) {
            int way = result.get(i - 3) + result.get(i -2);
            result.add(way);
        }

        return result.get(stairsCount - 1);

    }

    public static void main(String[] args){
        int stairsCount = 5;
        int ways = countVariants(stairsCount);
        System.out.println("number of variants to climb stairs: " + ways);
    }
}
