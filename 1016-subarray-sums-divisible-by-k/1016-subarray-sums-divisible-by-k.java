class Solution {
    public int subarraysDivByK(int[] a, int k) {
        int[] count=new int[k];
        count[0]=1;
        int sum=0;
        int res=0;
        for(int i=0; i<a.length; i++){
            sum+=a[i];
            int rem=sum%k;
            if(rem<0){
                rem+=k;
            }
            res+=count[rem];
            count[rem]++;
        }
        return res;
    }
}