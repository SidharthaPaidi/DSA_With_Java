public class HouseRobber {

    public static int maxMoney(int[] HouseNetWorth){
        return maxMoneyRecursive(HouseNetWorth, 0);
    }

    private static int maxMoneyRecursive(int[] HouseNetWorth ,  int currentIndex){
        if(currentIndex >= HouseNetWorth.length){
            return 0;
        }

        int stealCurrentHouse = HouseNetWorth[currentIndex] + maxMoneyRecursive(HouseNetWorth, currentIndex + 2);
        int skipCurrentHouse = maxMoneyRecursive(HouseNetWorth, currentIndex + 1);
        
        return Math.max(stealCurrentHouse , skipCurrentHouse);
    }

    public static void main(String[] args) {
        int[] HouseNetWorth = {6,7,1,30,8,2,4};
        System.out.println(maxMoney(HouseNetWorth));
    }
}
