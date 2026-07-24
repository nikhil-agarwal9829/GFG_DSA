class Solution {
    public static char getMaxOccuringChar(String s) {
        char[] cs = s.toCharArray();
        Arrays.sort(cs);
        int max=0;
        int k=0;
        int t=0;
        for(int i=0;i<(cs.length)-1; i++){

            if(cs[i]==cs[i+1]){
                t++;
                
            }else{
                t=0;
            }
            if(t>max){
                max=t;
                k=i;
                
            }
            
            
        }
        return cs[k];
        
        
    }
}