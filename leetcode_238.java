/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        if(nums.length==0 || nums==null){
            return new int[0];

        }

        int ans[]=new int[nums.length];

        int leftRunning=1;

        for(int i=0;i<nums.length;i++){

       ans[i]=leftRunning;
       leftRunning= leftRunning*nums[i];

        }

        

        int rightRunning=1;

        for(int j=nums.length-1;j>=0;j--){

            ans[j]=ans[j]*rightRunning;
            rightRunning= rightRunning*nums[j];
        }

return ans;

    }
}
