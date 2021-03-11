package com.min.edu;

public class UserMakeException extends Exception {

	public UserMakeException() {
		this("우리가 맹근 예외 처리 클래스");
	}

	public UserMakeException(String message) {
		super(message);
	}
}
