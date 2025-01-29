import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Solution {
    public int solution(String my_string) {
        int result = 0;
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(my_string);
        while (matcher.find()) {
            result += Integer.parseInt(matcher.group());
        }
        return result;
    }
}