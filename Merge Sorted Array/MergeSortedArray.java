class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //b
        int a = m-1;
        int b = n-1;
        int c = m+n-1;

        if(a == -1){
            for(int i = 0; i < n ; i++){
                nums1[i] = nums2[i];
            }
        }

        while(b>=0 && a>=0){
            if (nums2[b] >= nums1[a]){
                nums1[c] = nums2[b];
                b--;
            }else{
                nums1[c] = nums1[a];
                nums1[a] = nums2[b];
                a--;
                if(a < 0){
                    a+=1;
                    b--;
                }

            }
            c--;
        }

    }
}