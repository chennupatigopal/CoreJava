package com.java.core;

public class StringGCDEx {

	public static void main(String[] args) {

		// String str1 = "ABCABC", str2 = "ABC";

		// Input: str1 = "ABABAB", str2 = "ABAB"; output=AB
		 String str1 = "ABABAB", str2 = "ABAB";  //

		// Input: str1 = "LEET", str2 = "CODE" output=""
		// String str1 = "LEET", str2 = "CODE";

		// Input: str1 = "AAAAAB", str2 = "AAA" output=""

		// String str1 = "AAAAAB", str2 = "AAA"; // ""

		//String str1="TAUXXTAUXXTAUXXTAUXXTAUXX", str2="TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";

		// String str1="CXTXNCXTXNCXTXNCXTXNCXTXN", str2="CXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXN";

		//String str1 = "AAAAAAAAA", str2 = "AAACCC";  //out=""   ?
		 
		 
		// String str1="ABABAB", str2="ABA"; //out="";

		System.out.println("Str1 lengthg=" + str1.length() + ", str2 length=" + str2.length());
		String gcd = "";
		if (str2.length() > str1.length()) {

			int str2rem = str2.length() % str1.length();

			str2 = str2.substring(str2.length() - str2rem);
			
			
			while (str2.length() > 0) {
				

				int rem = str1.length() % str2.length();
				//System.out.println("Reminder:" + rem);

				if (rem == 0) {
					int multiple = str1.length() / str2.length();
					String compStr = "";

					for (int i = 0; i < multiple; i++) {
						compStr += str2;
					}

					if (str1.equals(compStr)) {
						gcd = str2;
						break;
					} else {

						str2 = str2.substring(0, str2.length() - 1);	

					}

				} else {

					str2 = str2.substring(0, str2.length() - 1);

				}
			}
			
		}else {
			
			String compStr=str1.substring(0,str2.length());
			
			System.out.println("compStr="+compStr+"="+str1);
			
			if(str2.equals(compStr)) {
				
			while (str2.length() > 0) {

				int rem = str1.length() % str2.length();
				System.out.println("Reminder:" + rem);

				if (rem == 0) {
					int multiple = str1.length() / str2.length();
					String testStr = "";

					for (int i = 0; i < multiple; i++) {
						testStr += str2;
					}

					if (str1.equals(testStr)) {
						gcd = str2;
						break;
					} else { //if(str2.length()>0) {	
						
						break;
						
						//str2 = str2.substring(0, str2.length() - 1);
					}
				} else {

					str2 = str2.substring(0, str2.length() - 1);

				}
			}
			}
			
		}

		
		System.out.println("GCD is=" + gcd);

	}
	
	
	
	

}
