class Solution {
    public long[] sumOfThree(long num) {
        long mid=num/3;
        if(mid*3==num) return new long[]{mid-1,mid,mid+1};
        return new long[]{};
    }
}