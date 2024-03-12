import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Stack<Integer> result = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            if(result.empty() || result.peek() != arr[i]){
                result.push(arr[i]);
            }
        }
        int index = result.size()-1;
        int[] answer = new int[index+1];
        
        while(!result.isEmpty()){
            answer[index--] = result.pop();
        }
        return answer;
    }
}