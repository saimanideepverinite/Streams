package string;

import java.util.Scanner;

class Substring {
	public static void main(String args[])
		{
			Solution s=new Solution();
			Scanner sc=new Scanner(System.in);
			String s1=sc.next();
		int l=	s.lengthOfLongestSubstring(s1);
		System.out.println("length of long substring "+l);
		}

	}
	class Solution {
	    public int lengthOfLongestSubstring(String s) {
	        int n = s.length();

	        int res = 0;
	        for (int i = 0; i < n; i++) {
	            for (int j = i; j < n; j++) {
	                if (checkRepetition(s, i, j)) {
	                    res = Math.max(res, j - i + 1);
	                }
	            }
	        }

	        return res;
	    }

	    private boolean checkRepetition(String s, int start, int end) {
	        int[] chars = new int[128];

	        for (int i = start; i <= end; i++) {
	            char c = s.charAt(i);
	            chars[c]++;
	            if (chars[c] > 1) {
	                return false;
	            }
	        }
	        return true;
	    }
	}
