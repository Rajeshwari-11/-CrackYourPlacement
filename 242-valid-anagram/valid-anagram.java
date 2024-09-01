class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        if(s.length()!=t.length()){
            return false;
        }
        Arrays.sort(ss);
        Arrays.sort(tt);
        for(int i=0;i<ss.length;i++){
            if(ss[i]!=tt[i]){
                return false;
            }
        }
        return true;
    }
}