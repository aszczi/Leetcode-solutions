
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

    int [] contains1 = new int[2001];
    int [] contains2 = new int[2001];
        for(int i =0; i< nums1.length; i++){
            contains1[nums1[i]+1000] = 1;
        }
        for(int i =0; i< nums2.length; i++){
           contains2[nums2[i] + 1000] = 1;
        }

        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        for(int i = 0 ; i < 2001; i++){
            if(contains1[i] == 1 && contains2[i] == 0){
                first.add(Integer.valueOf(i - 1000));
            }
            if(contains2[i] == 1 && contains1[i] == 0){
                second.add(Integer.valueOf(i -1000));
            }
        }
        
        answer.add(first);
        answer.add(second);
        return answer;
    }
}
