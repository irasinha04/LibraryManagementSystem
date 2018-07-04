package com.gitlab.irasinha04.jlm.util;

public class TestUtil {

	private TestUtil() {}
	
	public static void bmsTest(String actual, String expected, String variable) {
	    System.out.println(variable + " Test " + (actual.equals(expected)? "Passed" : "Failed"));
	}

	public static void bmsTest(int actual, int expected, String variable) {
	    System.out.println(variable + " Test " + (actual == expected ? "Passed" : "Failed"));
	}
	
}
