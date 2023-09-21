public class Single2 {

    public static Integer singleNumber(int[] nums){
        for(int i = 0; i <= nums.length; i++){
            for(int j = 0; j <= nums.length; j++){
                if(i != j && nums[i] == nums[j]){
                    break;
                }else{
                    return nums[i];
                }
            }
        }
        return 0;
    }
    public static void main(String[] args){
        int[] numbers = {1,5,5,3,3,2,2};
        int single = singleNumber(numbers);
        System.out.println("Single number:" + single);
    }
}
