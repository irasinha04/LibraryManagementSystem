package com.gitlab.irasinha04.jlm.util;

public class TestUtil {

	private TestUtil() {}
	
	public static void test(String actual, String expected, String variable) {
	    System.out.println(variable + " Test " + (actual.equals(expected)? "Passed" : "Failed"));
	}

	public static void test(int actual, int expected, String variable) {
	    System.out.println(variable + " Test " + (actual == expected ? "Passed" : "Failed"));
	}
	
}
