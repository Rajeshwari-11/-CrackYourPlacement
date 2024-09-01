class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder str = new StringBuilder();
        Stack<String> stack = new Stack<>();
        
        for(String words : arr){
            stack.push(words);
        }
        while(!stack.isEmpty()){
            str.append(stack.pop());
            if(stack.size()>0){
                str.append(" ");
            }
        }

        return str.toString();
        
    }
}