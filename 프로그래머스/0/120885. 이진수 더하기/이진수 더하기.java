import java.util.*;
class Solution {
    public String solution(String bin1, String bin2) {
        int q = 0;
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < bin1.length(); i++){
            if((bin1.charAt(i)+"").equals("1")){
                q += Math.pow(2, bin1.length() - (i+1));
            }
        }
        for(int i = 0; i < bin2.length(); i++){
            if((bin2.charAt(i)+"").equals("1")){
                q += Math.pow(2, bin2.length() - (i+1));
            }
        }
        if(q == 0) return "0";
        while(q > 0){
            if(q % 2 == 1) result.append("1");
            if(q % 2 == 0) result.append("0");
            q /= 2;
        }
        return result.reverse().toString();
    }
}