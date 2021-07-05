package com.newlecture.app.util;

public class TooLargeNum extends Exception {
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "배열 숫자를 초과했습니다.";
	}
}
