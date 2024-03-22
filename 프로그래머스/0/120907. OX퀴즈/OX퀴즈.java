class Solution {
    public String[] solution(String[] quiz) {
       String[] answer = new String[quiz.length];
		for(int i = 0; i < quiz.length; i++) {
			quiz[i] = quiz[i].replace(" = ", ",");
			if(quiz[i].indexOf(" + ") != -1) {
				quiz[i] = quiz[i].replace(" + ", ",");
				String[] str = quiz[i].split(",");
				if(Integer.parseInt(str[0]) + Integer.parseInt(str[1]) == Integer.parseInt(str[2])){
					answer[i] = "O";
				}else {
					answer[i] = "X";
				}
				
			}else {
				quiz[i] = quiz[i].replace(" - ", ",");
				String[] str = quiz[i].split(",");
				if(Integer.parseInt(str[0]) - Integer.parseInt(str[1]) == Integer.parseInt(str[2])){
					answer[i] = "O";
				}else {
					answer[i] = "X";
				}
			}
		}
		return answer;
    }
}