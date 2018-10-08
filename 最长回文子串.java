class Solution {
    public String longestPalindrome(String s) {
        int max = 0;
        int start = 0,end = 0;
        if(s==null || s.length()==0)return "";
        for(int i=0;i<s.length();i++){
            int l1 = expand(s,i,i);
            int l2 = expand(s,i,i+1);
            int l = l1>l2?l1:l2;
            if(l>max){
                max=l;
                start=i-(l-1)/2;
                end=i+(l/2);
            }
        }

        return s.substring(start, end + 1);

    }

    private int expand(String s, int left, int right) {

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}