import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> que = new ArrayDeque<>();
        for(int i = 0; i < progresses.length; i++){
            int remain = 100 - progresses[i];
            int workDay=(remain%speeds[i]!= 0)?remain/speeds[i]+1:remain/speeds[i];
            que.offer(workDay);
        }
        int k = que.poll();
        int cnt = 1;
        while(!que.isEmpty()){
            if(que.peek() > k){
                result.add(cnt);
                cnt = 1;
                k = que.poll();
            }else{
                cnt++;
                que.poll();
            }
        }
        result.add(cnt);
        
        int[] answer = result.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
