import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        String[] result = new String[picture.length * k];
        for(int i = 0; i < picture.length; i++){
            for(int j = 0; j < k; j++){
                result[(i*k)+j] = a(picture[i], k);
            }
        }
        return result;
    }
    public String a(String str, int k){
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
            for(int i = 0; i < k; i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}