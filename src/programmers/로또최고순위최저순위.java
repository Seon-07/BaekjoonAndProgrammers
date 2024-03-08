package programmers;

class 로또최고순위최저순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int gap = 0;
        int lottoNum = 0;
        for(int number: lottos){
            if(number == 0){
                gap++;
            }else{
                for(int num: win_nums){
                    if(num == number){
                        lottoNum++;
                    }
                }
            }
        }
        answer[0] = (gap+lottoNum) < 2 ? 6 : 7-(gap+lottoNum);
        answer[1] = lottoNum < 2 ? 6 : (7-lottoNum);
        return answer;
    }
}
