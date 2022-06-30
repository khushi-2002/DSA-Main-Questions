class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s=0;
        int e=numbers.length-1;
        int ans[]= new int[2];
        while(s<e){
            if(numbers[s]+numbers[e]==target){
                ans[0]=s+1;
                ans[1]=e+1;
                break;
            }
            
            else if(numbers[s]+numbers[e]<target){
                s++;
            }
            else{
                e--;
            }
        }
        return ans;
    }
}
