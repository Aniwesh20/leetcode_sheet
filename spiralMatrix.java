

//LEETCODE-54

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

     ArrayList<Integer>ans=new ArrayList<>();


     int minr=0;
     int maxr=matrix.length-1;
     int minc=0;
     int maxc=matrix[0].length-1;
int count =(maxr+1)*(maxc+1);

      
      while(count>0){
     for(int j=minc;j<=maxc && count!=0;j++){
         ans.add(matrix[minr][j]);
         count--;

     }
     minr++;
     for(int i=minr;i<=maxr && count!=0;i++){
         ans.add(matrix[i][maxc]);
       
       count--;
     }
     maxc--;

     for(int j=maxc;j>=minc && count!=0;j--){
      ans.add(matrix[maxr][j]);
     count--;
     }
     maxr--;



     for(int i=maxr;i>=minr && count!=0;i-- ){
         ans.add(matrix[i][minc]);
         count--;
     }
     minc++;
      }
      return ans;

    }
}
