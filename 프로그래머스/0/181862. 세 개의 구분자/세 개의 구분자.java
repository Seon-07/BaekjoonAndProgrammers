class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("[abc]", " ");
        if(myStr.trim().equals("")) return new String[]{"EMPTY"};
        return myStr.trim().split("\\s+");
        
    }
}