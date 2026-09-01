class Solution {
    public boolean isValid(String s) {
        Stack<Character> check = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char pos = s.charAt(i);
            if(pos == ')'){
                if(check.empty() || check.peek() != '(') return false;
                check.pop();
            }
            else if(pos == '}'){
                if(check.empty() || check.peek() != '{') return false;
                check.pop();
            }
            else if(pos == ']'){
                if(check.empty() || check.peek() != '[') return false;
                check.pop();
            } 
            else{
                check.push(pos);
            }
        }
        return check.empty();
    }
}
