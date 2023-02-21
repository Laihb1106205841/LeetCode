package Accepted;

public class No1 {
    public int[] twoSum(int[] nums, int target) {
        int l=nums.length;
        int i1=0;
        int i2=0;
        for(int i=0;i<l-1;i++){
            i1 =nums[i];
            for(int j=i+1;j<l;j++){
                i2=nums[j];
                if(i1+i2==target){
                    int[] ans=new int[2];
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }

            }
        }
        return null;
    }
}
