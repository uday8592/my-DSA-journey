class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum = 0, rightSum = 0, n = cardPoints.length;
        
        for (int i = 0; i < k; i++) {
            leftSum += cardPoints[i];
        }
        
        int maxSum = leftSum;
        
        for (int i = 0; i < k; i++) {
            leftSum -= cardPoints[k - 1 - i];
            rightSum += cardPoints[n - 1 - i];
            maxSum = Math.max(maxSum, leftSum + rightSum);
        }
        
        return maxSum;
    }
}
