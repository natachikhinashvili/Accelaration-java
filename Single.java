class Single{
    public static Integer singleNumber(int[] nums){
        int foundNumber = 0;

        if (nums.length == 0){
            return 0;
        }

        for(int num : nums){
            // I used XOR operation to solve this task
            // XOR operation( ^= ) takes 2 operations and returns true if the operans are different
            foundNumber ^= num;
        }

        return foundNumber;
    }
    public static void main(String[] args){
        int[] numbers = {1,5,5,3,3,2,2};
        int single = singleNumber(numbers);
        System.out.println("Single number:" + single);
    }

}