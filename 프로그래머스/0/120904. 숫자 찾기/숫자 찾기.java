class Solution {
    public int solution(int num, int k) {
        int result = -1;
        for(int i = 0; i < (num+"").length(); i++){
            if(((num+"").charAt(i)+"").equals(k+"")){
                result = i+1;
                break;    
            }
        }
        return result;
    }
}