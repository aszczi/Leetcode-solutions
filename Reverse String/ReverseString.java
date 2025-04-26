class Solution {
    public void reverseString(char[] s) {
        int rozmiarS = s.length;

        for(int i =0; i < rozmiarS/2; i++){
            char temp = s[i];
            s[i] = s[rozmiarS-1-i];
            s[rozmiarS-1-i] = temp;
        }
    }
}