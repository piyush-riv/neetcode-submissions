class Solution {
    public boolean isValid(String s) {
        Stack <Character>v= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                v.push(s.charAt(i));
            }
            else if(!v.isEmpty()&&v.peek()=='('&&s.charAt(i)==')'){
                v.pop();
            }
            else if(!v.isEmpty()&&v.peek()=='{'&&s.charAt(i)=='}'){
                v.pop();
            }
            else if(!v.isEmpty()&&v.peek()=='['&&s.charAt(i)==']'){
                v.pop();
            }
            else{
                return false;
            }
        }
        return v.isEmpty();
    }
}