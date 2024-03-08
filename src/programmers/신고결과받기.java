package programmers;

import java.util.*;

class 신고결과받기 {
	
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashSet<String>> reportMap = new HashMap<>();
        for(String name: id_list){
            reportMap.put(name, new HashSet<>());
        }
        for(String s: report){
            reportMap.get(s.split(" ")[1]).add(s.split(" ")[0]);
        }
        for(int i = 0; i < id_list.length; i++){
            if(reportMap.get(id_list[i]).size() >= k){
                HashSet<String> reportUser = reportMap.get(id_list[i]);
                for(String s : reportUser){
                    for(int j = 0; j < id_list.length; j++){
                        if(id_list[j].equals(s)){
                            answer[j]++;
                        }
                    }
                }
            }
        }
        return answer;
    }
}
