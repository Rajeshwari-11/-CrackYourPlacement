class Solution {
    public String largestOddNumber(String num) {
        int i=num.length()-1;
        for(i=num.length()-1;i>=0;i--){
            if((num.charAt(i)-'0')%2 !=0){
                return num.substring(0,i+1);
            }
        }
        return  "";
    }
}