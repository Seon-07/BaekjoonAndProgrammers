class Solution {
    public int solution(String my_string) {
        boolean isNum = true;
        boolean cal = true;
        int result = 0;
        for(String s : my_string.split(" ")){
            if(isNum){
                int num = Integer.parseInt(s);
                result = cal ? result + num : result - num;
                isNum = false;
            }else{
                cal = s.equals("+") ? true : false;
                isNum = true;
            }
        }
        return result;
    }
}