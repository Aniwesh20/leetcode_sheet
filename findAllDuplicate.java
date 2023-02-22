
//leetcode-442

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        

   HashMap<Integer,Integer> fmap=new HashMap<>();
    List<Integer> ans=new ArrayList<>();

if(nums.length==1){
     return new ArrayList<>();
}

  for(int val:nums){
      if(fmap.containsKey(val)==true){
          int of= fmap.get(val);
          int nf= of+1;
      
      fmap.put(val,nf);

      }
      else{
          fmap.put(val,1);
      }
   
  }

   for(int ele:fmap.keySet()){

       if(fmap.get(ele)==2){
           ans.add(ele);
           
       }
   }


return ans;
 





   
  


  
   

    }
}