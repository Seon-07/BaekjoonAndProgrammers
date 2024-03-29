class Solution {
    boolean solution(String s) {
        int k = 0;
        for(int i = 0; i < s.length(); i++){
            if((""+s.charAt(i)).equals("(")){
                k++;
            }else{
                k--;
            }
            if(k < 0){
                break;
            }
        }
        return k == 0 ? true : false;
    }
}