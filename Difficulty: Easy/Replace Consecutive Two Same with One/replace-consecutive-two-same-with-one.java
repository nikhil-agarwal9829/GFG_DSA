class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                sb.append(s.charAt(i));
            }
        }
        sb.append(s.charAt(s.length()-1));
        return sb.toString();
        
    }
}