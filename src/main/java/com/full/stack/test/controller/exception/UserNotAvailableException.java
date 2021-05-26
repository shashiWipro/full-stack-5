package com.full.stack.test.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class UserNotAvailableException extends RuntimeException {
public UserNotAvailableException(String string)
{
	super(string);
}
}
