//LEETCODE-48.

class  Solution {
    public void rotate(int[][] matrix)           {
        int n = matrix[0].length;
        // calculate the range which should rotate
        int limitI = n / 2 - 1;
        int limitJ = limitI;
        // if length is odd number we should take care one more column
        if(n % 2 == 1) limitJ++;
        int tempI;
        int tempJ;
        int tempCurrVal = -1;
        // only traverse inside i and j limit
        for(int i = 0 ; i <= limitI ; i++) {
            for(int j = 0 ; j <= limitJ ; j++) {
                tempI = i;
                tempJ = j;
                // we should go through 5 times to bring back the correct last rotated value to first position
                for(int k = 0 ; k < 5 ; k++) {
                    // memorize new current value(for bringing to next) and put tempCurrVal at current position(simply swap)
                    int tempTempCurr = tempCurrVal;
                    tempCurrVal = matrix[tempI][tempJ];
                    matrix[tempI][tempJ] = tempTempCurr;
                    // go to next rotate position(you can simply go through and observe the processes and can get below formula)
                    int tempTempI = tempI;
                    tempI = tempJ;
                    tempJ = n - 1 - tempTempI;
                }   
            }
        }
    }
}
