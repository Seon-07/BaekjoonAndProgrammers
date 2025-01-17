import java.util.*;
class Solution {
    public String solution(String s) {
    	String[] arr = s.split("");
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(!arr[i].equals(arr[i-1])){
                sb.append(arr[i]);
            }else{
                int idx = sb.indexOf(arr[i]);
                if(idx != -1) sb.delete(idx, idx + 1);
            }
        }
        return sb.toString();
    }
}