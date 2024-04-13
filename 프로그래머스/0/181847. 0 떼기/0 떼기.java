class Solution {
    public String solution(String n_str) {
        int k = 0;
        if((n_str.charAt(0)+"").equals("0")){
            for(int i = 0; i < n_str.length(); i++){
                if(!(n_str.charAt(i)+"").equals("0")){
                    k = i;
                    break;
                }
            }
        }else{
            return n_str;
        }
        return n_str.substring(k);
    }
}