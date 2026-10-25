package com.java.core;

public class StringGCDEx {

	public static void main(String[] args) {

		// String str1 = "ABCABC", str2 = "ABC";

		// Input: str1 = "ABABAB", str2 = "ABAB"; output=AB
		// String str1 = "ABABAB", str2 = "ABAB"; //

		// Input: str1 = "LEET", str2 = "CODE" output=""
		// String str1 = "LEET", str2 = "CODE";

		// Input: str1 = "AAAAAB", str2 = "AAA" output=""

		// String str1 = "AAAAAB", str2 = "AAA"; // ""

		// String str1="TAUXXTAUXXTAUXXTAUXXTAUXX",
		// str2="TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";

		// String str1="CXTXNCXTXNCXTXNCXTXNCXTXN",
		// str2="CXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXN";

		//String str1 = "AAAAAAAAA", str2 = "AAACCC"; // out="" ?

		 String str1="ABABAB", str2="ABA"; //out="";

		if (!(str1 + str2).equals(str2 + str1)) {
			System.out.println("GCD is=");
		} else {

			int len1 = str1.length();
			int len2 = str2.length();

			int gcd = findGCD(len1, len2);

			System.out.println("GCD is=" + str1.substring(0, gcd));
		}

	}

	private static int findGCD(int len1, int len2) {

		return len2 == 0 ? len1 : findGCD(len2, len1 % len2);
	}

}
