package com.array.basics;

/*
 * You are given an integer N. You need to convert all zeroes of N to 5.
 * 
 */


public class Replace0with5 {

	public static void main(String[] args) {
		int num = 1005;
		String str = String.valueOf(num);
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(c == '0') {
				sb.append(5);
			}else {
				sb.append(c);
			}
		}
		
		int n = Integer.parseInt(sb.toString());
		System.out.println(n);
		
		

	}

}
