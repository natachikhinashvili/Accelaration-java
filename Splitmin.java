public class Splitmin {

    public static Integer minSplit(int amount){
        int[] coins = {1, 5, 10, 20, 50};
        int min = 0;

        //reverse the array so we iterate from highest to lowest value of coins
        int[] reversed = new int[coins.length];

        for(int i = 0; i < coins.length; i++){
            reversed[i] = coins[coins.length - i - 1];
        }

        /* 
            this loop iterates over coins and checks if amount that you passed is more than
            the coin that we are operating over, than we subtract from the amount and add it to the minimum
        */
        for(int coin : reversed){
            while(amount >= coin){
                amount -= coin;
                min++;
            }
        }
        return min;
    }
    public static void main(String[] args){
        int amount = 93;
        int min = minSplit(amount);
        System.out.println("Minimum number of coins: " + min);
    }
}
