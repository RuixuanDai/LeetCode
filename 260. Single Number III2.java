public class Solution {
  public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        int result = nums[0];
        for(int i=1;i<nums.length;i++){
        	result = result^nums[i];
        }
        res[0] = 0;
        res[1] = 0;
        int n = result & (~(result-1));
        for(int i=0;i<nums.length;i++){
            if((n & nums[i])!=0){
                res[0] = res[0] ^ nums[i];
            }else {
                res[1] = res[1] ^ nums[i];
            }
        }
        return res;
    }
}
