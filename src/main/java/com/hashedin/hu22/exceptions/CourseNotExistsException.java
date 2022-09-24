package com.hashedin.hu22.exceptions;

public class CourseNotExistsException extends IllegalArgumentException {
	public CourseNotExistsException(String msg) {
		super(msg);
	}
}
