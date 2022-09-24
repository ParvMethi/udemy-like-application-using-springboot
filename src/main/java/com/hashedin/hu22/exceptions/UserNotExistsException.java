package com.hashedin.hu22.exceptions;

public class UserNotExistsException extends IllegalArgumentException {
	public UserNotExistsException(String msg) {
		super(msg);
	}
}
