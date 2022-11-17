
import java.util.*;


public class Q12 {
    static int count(String s) {
    int cnt = 0, res = 0;
    for (int i = 0; i < s.length(); ++i) {
        if (i > 0 && s.charAt(i - 1) == s.charAt(i))
            ++cnt;
        else
            cnt = 1;
        res = (res + cnt);
    }
    return res;
}
	public static void main(String[] args){
	String s="aabca";
	System.out.println(count(s));
	}
}