package programmers;

public class 시저암호 {
	public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            if(!(""+s.charAt(i)).equals(" ")){
                int word = (int)s.charAt(i)+n;
                if(word-n <= 90 ){
                    word = word>90 ? 64+(word-90) : word;
                }else{
                    word = word>122 ? 96+(word-122) : word;
                }
                answer+=(char)(word);  
            }else{
                answer+=" ";
            }
        }
        return answer;
    }
}
