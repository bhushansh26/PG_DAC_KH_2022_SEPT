import java.io.*;
import java.util.*;
class Q15{
 static int findTheLongestSubstring(String s) {
        int res = 0 , cur = 0, n = s.length();
        HashMap<Integer, Integer> seen = new HashMap<>();
        seen.put(0, -1);
        for (int i = 0; i < n; ++i) {
            cur ^= 1 << ("aeiou".indexOf(s.charAt(i)) + 1 ) >> 1;
            seen.putIfAbsent(cur, i);
            res = Math.max(res, i - seen.get(cur));
        }
        return res;
    }
	public static void main(String[] args){
		String s="aeiouaeioua";
		String s1="bbb";
		System.out.println(findTheLongestSubstring(s));
		System.out.println(findTheLongestSubstring(s1));
	}
}