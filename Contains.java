import java.util.ArrayList;
import java.util.List;

public class Contains {
    public static Integer notContains(int[] array){
        List<Integer> numbers = new ArrayList<>();

        for (int num : array) {
            numbers.add(num);
        }

        int min = 1;

        // iterate through integers until the smallest missing number(greater than 0) is found
        while (numbers.contains(min) && min > 0) {
            min++;
        }

        return min;

    }
    public static void main(String[] args){
        int[] array = {1, 4, 3, 7};
        int result = notContains(array);
        System.out.println("Minimum missing number: " + result);
    }
}
