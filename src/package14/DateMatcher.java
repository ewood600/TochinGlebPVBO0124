package package14;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateMatcher {
    public static boolean DateMatch(String date){
        Pattern pattern = Pattern.compile("\\d{2}" + "/" + "\\d{2}" + "/" + "\\d{4}");
        Matcher matcher = pattern.matcher(date);
        if (!matcher.matches()){
            return false;
        }
        StringTokenizer st = new StringTokenizer(date,"/");
        int d = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        if (d < 31 + m%2 & m < 13 & y > 1899){
            if (d > 28 & m == 2){
                return d == 29 & y % 4 == 0;
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(DateMatch("29/02/2000"));
    }
}
