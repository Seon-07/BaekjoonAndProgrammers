class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String tmp = " ";
        s = s.toLowerCase();
        for(char c : s.toCharArray()){
            if(tmp.equals(" ") && c >= 97){
                String u = Character.toUpperCase(c)+"";
                sb.append(u);
            }else{
                sb.append(c+"");    
            }
            tmp = c+"";
        }
        return sb.toString();
    }
}