class Solution {
    public String solution(String[] id_pw, String[][] db) {
        for(String[] acc : db){
            if(id_pw[0].equals(acc[0])){
                if(id_pw[1].equals(acc[1])){
                    return "login";
                }else{
                    return "wrong pw";
                }
            }
        }
        return "fail";
    }
}